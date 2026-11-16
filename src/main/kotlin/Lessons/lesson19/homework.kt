package org.example.Lessons.lesson19

// 1. Средний элемент: чётный размер → null, нечётный → элемент по индексу size/2
fun <T> getMiddleElement(list: List<T>): T? =
    if (list.size % 2 == 0) null else list[list.size / 2]

// 2. Хранилище: мутабельный внутри, наружу — неизменяемая копия
class ListHolder<T> {
    private val items: MutableList<T> = mutableListOf()
    fun add(item: T) { items.add(item) }
    fun getAll(): List<T> = items.toList()
}

// 3. Интерфейс с двумя дженериками: элемент→элемент и список→список
interface Mapper<A, B> {
    fun map(element: A): B
    fun map(list: List<A>): List<B>
}

// 4. Строка разбивается по пробелу; список строк — аналогично поэлементно
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(element: String): List<String> = element.split(" ")
    override fun map(list: List<String>): List<List<String>> = list.map { map(it) }
}

// 5. Транспозиция: ключ ↔ значение (дубликаты значений «съедаются» — останется последний)
fun <K, V> transposition(map: Map<K, V>): Map<V, K> =
    map.entries.associate { (k, v) -> v to k }

// 6. Интерфейс валидатора
interface Validator<T> {
    fun validate(element: T): Boolean
}

// 7. String?: не null, не пустая, не только пробелы — всё это делает isNullOrBlank()
class StringValidator : Validator<String?> {
    override fun validate(element: String?): Boolean = !element.isNullOrBlank()
}

// 8. Int: чётное. ВНИМАНИЕ: имя OddValidator («нечётный»), а проверка по ТЗ — чётность
class OddValidator : Validator<Int> {
    override fun validate(element: Int): Boolean = element % 2 == 0
}

// 9. List<T?> для T : Number: ни один не null и ни один не 0.0
class ListValidator<T : Number> : Validator<List<T?>> {
    override fun validate(element: List<T?>): Boolean =
        element.all { it != null && it.toDouble() != 0.0 }
}