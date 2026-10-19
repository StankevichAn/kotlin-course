fun main () {
    val list = listOf(1, 2, 3)

    list.size > 5

    list.isEmpty()

    list.isNotEmpty()

    list.getOrElse(5) { 0 }
// Собрать коллекцию в строку:
    list.joinToString()
//Посчитать сумму всех значений:
    list.sum()
//Посчитать среднее:
    list.average()
//Взять максимальное число:
    list.maxOrNull()
//Взять минимальное число:
    list.minOrNull()
//Взять первое число или null:
    list.firstOrNull()
//Проверить что коллекция содержит элемент:
    list.contains(3)

    //Задачи на обработку коллекций

    val nubers = listOf(1, 2, 3, 4, 5 )
    val words: List<String?> = listOf("111", null, "1222")
    //Отфильтровать коллекцию по диапазону 18-30:
    numbers.filter { it in 18..30 }
    //Выбрать числа, которые не делятся на 2 и 3 одновременно:
    numbers.filterNot { it % 2 == 0 && it % 3 == 0 }
    //Очистить текстовую коллекцию от null элементов:
    words.filterNotNull()
    //Преобразовать текстовую коллекцию в коллекцию длин слов:
    words.map { it?.length ?: 1 }
    //Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов:
    words.associate { (it?.reversed() ?: 1) to (it?.length ?: 1) }
    //Отсортировать список в алфавитном порядке:
    //words.sorted()
    // Взять первые 3 элемента списка:
    list.take(3)
    //Распечатать квадраты элементов списка:
    numbers.forEach { println(it * it) }
    //Группировать список по первой букве слов:
    words.groupBy { it?.first() ?: 1 }
    //Очистить список от дублей:
    list.distinct()
    //Отсортировать список по убыванию:
    list.sortedDescending()
    //Взять последние 3 элемента списка:
    list.takeLast(3)

    //Задача 24. Характеристика числовой коллекции
    fun getCollectionCharacteristic(numbers: List<Int>): String {
        return when {
            numbers.isEmpty() -> "Пусто"
            numbers.size < 5 -> "Короткая"
            numbers.firstOrNull() == 0 -> "Стартовая"
            numbers.sum() > 10000 -> "Массивная"
            numbers.average() == 10.0 -> "Сбалансированная"
            numbers.joinToString("").length == 20 -> "Клейкая"
            (numbers.maxOrNull() ?: 0) < -10 -> "Отрицательная"
            (numbers.minOrNull() ?: 0) > 1000 -> "Положительная"
            numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
            else -> "Уникальная"
        }
    }

    // Вызовы метода с подходящими данными под каждую ветку:
    fun runTask24() {
        println(getCollectionCharacteristic(listOf()))
        println(getCollectionCharacteristic(listOf(1, 2, 3)))
        println(getCollectionCharacteristic(listOf(0, 1, 2, 3, 4)))
        println(getCollectionCharacteristic(listOf(5000, 6000, 1, 1, 1)))
        println(getCollectionCharacteristic(listOf(10, 10, 10, 10, 10)))
        println(getCollectionCharacteristic(listOf(12345, 12345, 12345, 12345, 12345)))
        println(getCollectionCharacteristic(listOf(-15, -20, -30, -40, -50)))
        println(getCollectionCharacteristic(listOf(1005, 1010, 1020, 1030, 1040)))
        println(getCollectionCharacteristic(listOf(3, 14, 1, 2, 5)))
        println(getCollectionCharacteristic(listOf(5, 6, 7, 8, 9)))
    }

//    Задача 25. Анализ учебных оценок
fun analyzeGrades(grades: List<Int>): List<Int> {
    return grades
        .filter { it >= 60 }
        .sorted()
        .take(3)
}
    //Задача 26. Создание каталога по первой букве
    fun createCatalog(list: List<String>): Map<Char, List<String>> {
        return list
            .map { it.lowercase() }
            .groupBy { it.first() }
    }
    //Задание 27. Подсчёт средней длины слов в списке
    fun calculateAverageWordLength(list: List<String>): String {
        val averageLength = list
            .map { it.length }
            .average()

        return String.format("%.2f", averageLength)
    }
    //Задание 28: Категоризация чисел
    fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
        return numbers
            .distinct()
            .sortedDescending()
            .groupBy { if (it % 2 == 0) "четные" else "нечетные" }
    }
    //Задание 29: Поиск первого подходящего элемента
    fun findFirstAgeAboveThreshold(ages: List<Int?>, threshold: Int): Int? {
        return ages
            .filterNotNull()
            .firstOrNull { it > threshold }
    }

}