fun transformPhrase(phrase: String) {
    val result= when {
        phrase.contains("невозможно", ignoreCase = true) -> phrase.replace(
            "невозможно",
            "совершенно точно возможно, просто требует времени"
        )
        else -> println(phrase)
    }
    println(result)
}

fun transformPhrase2(phrase: String) {
    if (phrase.startsWith("Я не уверен")) {
        println(phrase + ", но моя интуиция говорит об обратном")}else {
        println(phrase)
    }
}

fun transformPhrase3(phrase: String) {
    if (phrase.contains("катастрофа")) {
        val newPhrase = phrase.replace("катастрофа", "интересное событие")
        println(newPhrase)
    } else {
        println(phrase)
    }
}

fun transformPhrase4(phrase: String) {
    if (phrase.endsWith("без проблем") ) {
        val newPhrase = phrase.replace("катастрофа", "интересное событие")
        println(newPhrase)
    } else {
        println(phrase)
    }
}

fun transformSingleWord(phrase: String) {
    val cleanPhrase = phrase.trim()
    if (!cleanPhrase.contains(" ")) {
        println("Иногда, " + cleanPhrase + ", но не всегда")
    } else {
        println(cleanPhrase)
    }
}

//2

val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
fun transformPhrase6(log: String) {
    val mainParts = log.split(" -> ")
    val dateTimePart = mainParts[1]
    val dateTimeParts = dateTimePart.split(" ")
    val date = dateTimeParts[0]
    val time = dateTimeParts[1]
    println("Дата: $date")
    println("Время: $time")
}
//3

fun maskCreditCard(cardNumber: String) {
    val maskEndIndex = cardNumber.length - 4

    val leftPart = cardNumber.substring(0, maskEndIndex)

    val rightPart = cardNumber.substring(maskEndIndex)

    val maskedLeft = leftPart
        .replace("1", "*")
        .replace("2", "*")
        .replace("3", "*")
        .replace("4", "*")
        .replace("5", "*")
        .replace("6", "*")
        .replace("7", "*")
        .replace("8", "*")
        .replace("9", "*")
        .replace("0", "*")

    println(maskedLeft + rightPart)
}

fun transformPhrase5(phrase: String) {
    val safeEmail = phrase
        .replace("@", " [at] ")
        .replace(".", " [dot] ")

    println(safeEmail)
}
//5
fun transformPhrase7(phrase: String) {
    val fileName = phrase.substringAfterLast("/")
    println(fileName)
}

//6

fun transformPhrase8(phrase: String) {
    var abbreviation = ""
    val words = phrase.split(" ")
    for (word in words) {
        if (word.isNotEmpty()) abbreviation += word[0]
    }
    println(abbreviation.uppercase())
}

fun main() {
    val phrase = "Это сделать невозможно в такие сроки."
    var phrase2 = "Я не уверен"
    var phrase3 = "катастрофа"
    var phrase4 = "без проблем"
    val phraze5 = "однафраза"
    val card = "4539 1488 0343 6467"
    val myEmail = "username@example.com"
    transformPhrase(phrase)
    transformPhrase2(phrase2)
    transformPhrase3(phrase3)
    transformPhrase4(phrase4 )
    transformSingleWord(phraze5)
    transformPhrase6(log)
    maskCreditCard(card)
    transformPhrase5(myEmail)
    transformPhrase7("C:/Пользователи/Документы/report.txt")
    transformPhrase8("объектно ориентированное программирование")
}
