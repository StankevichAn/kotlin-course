//1
interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}
abstract class AbstractFridge : Powerable, Openable, TemperatureRegulatable

abstract class AbstractWashingMachine : Powerable, Openable, WaterContainer, Timable, Drainable

abstract class AbstractSmartLamp : Powerable, LightEmitting, Rechargeable

abstract class AbstractElectronicClock : Powerable, Timable, SoundEmitting

abstract class AbstractRobotVacuum : Powerable, Movable, Cleanable, Rechargeable, AutomaticShutdown

abstract class AbstractMechanicalClock : Mechanical, Timable

abstract class AbstractFlashlight : Powerable, LightEmitting, BatteryOperated

abstract class AbstractCoffeeMachine : Powerable, WaterContainer, WaterConnection, TemperatureRegulatable, SoundEmitting

abstract class AbstractSmartSpeaker : Powerable, SoundEmitting, Programmable

//2

abstract class PowerableDevice : Powerable {
    var isPoweredOn: Boolean = false
        protected set

    override fun powerOn() {
        isPoweredOn = true
        println("${this.javaClass.simpleName}: Питание включено.")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("${this.javaClass.simpleName}: Питание выключено.")
    }
}

//3

abstract class ProgrammableDevice : PowerableDevice(), Programmable {
    protected var currentProgram: String? = null

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("${this.javaClass.simpleName}: Ошибка! Нельзя запрограммировать выключенное устройство.")
            return
        }
        currentProgram = action
        println("${this.javaClass.simpleName}: Задана программа -> \"$action\".")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("${this.javaClass.simpleName}: Ошибка! Нельзя запустить программу на выключенном устройстве.")
            return
        }
        val program = currentProgram
        if (program != null) {
            println("${this.javaClass.simpleName}: Выполняется программа: \"$program\".")
        } else {
            println("${this.javaClass.simpleName}: Программа не задана.")
        }
    }
}
//4
abstract class ThermalOpenableDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {
    protected var currentTemperature: Int = 0
    protected var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("${this.javaClass.simpleName}: Ошибка! Нельзя изменить температуру. Устройство выключено.")
            return
        }
        if (temp > maxTemperature) {
            println("${this.javaClass.simpleName}: Превышена максимальная температура ($maxTemperature°C)!")
            return
        }
        currentTemperature = temp
        println("${this.javaClass.simpleName}: Установлена температура: $temp°C.")
    }

    override fun open() {
        isOpen = true
        println("${this.javaClass.simpleName}: Дверца/крышка открыта.")
    }

    override fun close() {
        isOpen = false
        println("${this.javaClass.simpleName}: Дверца/крышка закрыта.")
    }
}
//5
class Fridge : ThermalOpenableDevice() {
    override val maxTemperature: Int = 10 // Например, максимум +10 для охлаждения

    // Дополнительных интерфейсов не требуется по условию, базовых достаточно
}

// 2. Стиральная машина
class WashingMachine : ThermalOpenableDevice(), WaterContainer, Drainable, Timable {
    override val maxTemperature: Int = 90
    override val capacity: Int = 50 // Вместимость бака в литрах
    private var waterLevel = 0

    override fun fillWater(amount: Int) {
        if (!isPoweredOn) {
            println("Стиральная машина: Ошибка! Нельзя набрать воду, питание выключено.")
            return
        }
        waterLevel = (waterLevel + amount).coerceAtMost(capacity)
        println("Стиральная machine: Набрано воды. Текущий уровень: $waterLevel л.")
    }

    override fun getWater(amount: Int) {
        waterLevel = (waterLevel - amount).coerceAtLeast(0)
        println("Стиральная машина: Использовано $amount л воды.")
    }

    override fun connectToDrain() {
        println("Стиральная машина: Подключена к сливу.")
    }

    override fun drain() {
        if (!isPoweredOn) {
            println("Стиральная машина: Ошибка! Нельзя слить воду без питания.")
            return
        }
        waterLevel = 0
        println("Стиральная машина: Вода полностью слита.")
    }

    override fun setTimer(time: Int) {
        if (!isPoweredOn) {
            println("Стиральная машина: Ошибка! Таймер не работает без питания.")
            return
        }
        println("Стиральная машина: Таймер отложенного старта установлен на $time мин.")
    }
}

// 3. Чайник
class Kettle : ThermalOpenableDevice(), WaterContainer {
    override val maxTemperature: Int = 100
    override val capacity: Int = 2
    private var waterLevel = 0

    override fun fillWater(amount: Int) {

        waterLevel = (waterLevel + amount).coerceAtMost(capacity)
        println("Чайник: Налито воды. Текущий объем: $waterLevel л.")
    }

    override fun getWater(amount: Int) {
        waterLevel = (waterLevel - amount).coerceAtLeast(0)
        println("Чайник: Вылито $amount л воды.")
    }
}

// 4. Духовка
class Oven : ThermalOpenableDevice(), Timable {
    override val maxTemperature: Int = 250

    override fun setTimer(time: Int) {
        if (!isPoweredOn) {
            println("Духовка: Ошибка! Нельзя завести таймер на выключенной духовке.")
            return
        }
        println("Духовка: Таймер приготовления установлен на $time мин.")
    }
}