
fun whatSeason(numberOfMonth: Int) {
    when (numberOfMonth) {
        in 1..2 -> println("Зима")
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        in 12.. 12-> println("Зима")
        else -> println("Не входит в диапазон месяцев")
    }
}

fun age(ageOfpet: Int) {
    if (ageOfpet <= 2) {
        println(ageOfpet * 10.5)
    } else if (ageOfpet > 2) println((ageOfpet * 4)+21)
}


fun bestWayToGo(amountKilometrs: Int) {
    if (amountKilometrs <= 1) { println("пешком") }
    else if (amountKilometrs <= 5) { println("велосипед") }
    else if (amountKilometrs > 5) { println("автотранспорт") }
}
fun calculateBonuses(purchaseAmount: Int) {
    val bonusPoints = when {
        purchaseAmount <= 1000 -> (purchaseAmount / 100) * 2
        else -> (purchaseAmount / 100) * 3
    }
    println("Начислено бонусов: $bonusPoints")
}

fun FileType(extension: String) {
    when (extension) {
        "txt", "doc", "docx" -> println("Текстовый документ")
        "jpg", "jpeg", "png", "gif" -> println("Изображение")
        "xls", "xlsx", "csv" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

fun convertTemperature(degree: Double, unit: String) {
    if (unit == "C") {
        val fahrenheit = (degree * 9 / 5) + 32
        print(fahrenheit)
        print("F")
        println()
    } else if (unit == "F") {
        val celsius = (degree - 32) * 5 / 9
        print(celsius)
        print("C")
        println()
    } else {
        println("Ошибка: неизвестная единица измерения. Используйте 'C' или 'F'.")
    }
}

fun recommendClothing(temperature: Int) {
    if (temperature < -30 || temperature > 35) {
        println("Рекомендуется не выходить из дома!")
    } else if (temperature < 10) {
        println("куртка и шапка")
    } else if (temperature <= 18) {
        println("ветровка")
    } else {
        println("футболка и шорты")
    }
}

fun MovieCategory(age: Int) {
    when (age) {
        in 0..9 -> println("детские")
        in 10..18 -> println("подростковые")
        else -> println("18+")
    }
}
fun main() {
    whatSeason(9)
    age(2)
    bestWayToGo(8)
    calculateBonuses(700)
    FileType("docx")
    convertTemperature(25.0, "C")
    recommendClothing(25)
    MovieCategory(25)
}