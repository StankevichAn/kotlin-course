//1. Животные и Их Звуки
open class Animal(val name: String) {

    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog : Animal("Собака") {
    override fun makeSound() {

        println("\u001B[34mBark\u001B[0m")
    }
}

class Cat : Animal("Кошка") {
    override fun makeSound() {

        println("\u001B[31mMeow\u001B[0m")
    }
}

class Bird : Animal("Птица") {
    override fun makeSound() {

        println("\u001B[33mTweet\u001B[0m")
    }
}

fun runAnimals() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal("Неизвестное существо"))
    for (animal in animals) {
        print("${animal.name} говорит: ")
        animal.makeSound()
    }
}

// 2. Геометрические Фигуры и Их Площадь

import kotlin.math.PI
import kotlin.math.sin


open class Shape {
    open fun area(): Double = 0.0
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}

class Square(val side: Double) : Shape() {
    override fun area(): Double = side * side
}


class Triangle(val sideA: Double, val sideB: Double, val angleInDegrees: Double) : Shape() {
    override fun area(): Double {
        val radians = Math.toRadians(angleInDegrees)
        return 0.5 * sideA * sideB * sin(radians)
    }
}

fun runShapes() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0, 90.0) // Прямоугольный треугольник
    )
    for (shape in shapes) {
        println("Площадь фигуры: ${shape.area()}")
    }
}
// Принтер
abstract class Printer {
    abstract fun printText(text: String)
}

class LaserPrinter : Printer() {
    override fun printText(text: String) {
        val words = text.split(" ")
        for (word in words) {
            println("\u001B[30m\u001B[47m$word\u001B[0m")
        }
    }
}

class InkjetPrinter : Printer() {
    override fun printText(text: String) {
        val words = text.split(" ")
        val colors = listOf(
            "\u001B[31m" to "\u001B[43m", // красный на желтом
            "\u001B[32m" to "\u001B[44m", // зеленый на синем
            "\u001B[34m" to "\u001B[45m", // синий на пурпурном
            "\u001B[35m" to "\u001B[42m"  // пурпурный на зеленом
        )

        for ((index, word) in words.withIndex()) {
            // Выбираем цвета по кругу с помощью остатка от деления %
            val colorPair = colors[index % colors.size]
            println("${colorPair.first}${colorPair.second}$word\u001B[0m")
        }
    }
}

fun runPrinter() {
    val text = "Kotlin ООП переопределение методов принтер работает отлично"

    println("--- Лазерная печать ---")
    LaserPrinter().printText(text)

    println("\n--- Струйная печать ---")
    InkjetPrinter().printText(text)
}


// 1. «Корзина товаров»

class Cart {

    private val items = mutableMapOf<String, Int>()


    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }


    fun addToCart(itemId: String, amount: Int) {
        if (amount > 0) {
            items[itemId] = items.getOrDefault(itemId, 0) + amount
        }
    }


    fun addToCart(newItems: Map<String, Int>) {
        for ((id, amount) in newItems) {
            items[id] = items.getOrDefault(id, 0) + amount
        }
    }


    fun addToCart(itemIds: List<String>) {
        for (id in itemIds) {
            addToCart(id)
        }
    }


    override fun toString(): String {
        if (items.isEmpty()) return "Корзина пуста"

        val sb = StringBuilder()
        sb.append("--- СОДЕРЖИМОЕ КОРЗИНЫ ---\n")
        sb.append(String.format("%-15s | %-10s\n", "ID Товара", "Количество"))
        sb.append("---------------------------\n")

        var totalQuantity = 0
        for ((id, count) in items) {
            sb.append(String.format("%-15s | %-10d\n", id, count))
            totalQuantity += count
        }

        sb.append("---------------------------\n")
        sb.append("Уникальных артикулов: ${items.size}\n")
        sb.append("Всего товаров в корзине: $totalQuantity\n")

        return sb.toString()
    }
}

fun runCart() {
    val cart = Cart()

    cart.addToCart("Товар_A")
    cart.addToCart("Товар_B", 5)
    cart.addToCart(mapOf("Товар_A" to 2, "Товар_C" to 10))
    cart.addToCart(listOf("Товар_B", "Товар_D", "Товар_D"))

    println(cart)
}

//2. Логгер

class Logger {
 
    fun log(message: String) {
        println("[INFO] $message")
    }


    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "WARNING" -> println("\u001B[33m[WARNING] $message\u001B[0m") // Желтый текст
            "ERROR" -> println("\u001B[30m\u001B[41m[ERROR] $message\u001B[0m") // Черный текст на красном фоне
            else -> println("[$level] $message")
        }
    }


    fun log(messages: List<String>) {
        for (msg in messages) {
            log(msg) // Вызываем базовый метод INFO
        }
    }


    fun log(exception: Exception) {
        val msg = exception.message ?: "Unknown error occurred"
        println("\u001B[30m\u001B[41m[ERROR] $msg\u001B[0m")
    }
}

fun runLogger() {
    val logger = Logger()

    logger.log("Система успешно запущена")
    logger.log("WARNING", "Заканчивается свободное место на диске")
    logger.log("ERROR", "Не удалось подключиться к базе данных")

    logger.log(listOf("Загрузка модуля 1...", "Загрузка модуля 2...", "Все модули готовы"))

    logger.log(NullPointerException("Переменная не инициализирована!"))
}

