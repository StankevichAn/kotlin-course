package org.example.Lessons.lesson20

fun Array<Int>.getAround(): Pair<Int?, Int?> {
    return if (isEmpty()) {
        null to null
    } else {
        first() to last()
    }
}
// 2
fun <T : Comparable<T>> MutableList<T>.sort(direction: Boolean): List<T> {
    val self = toList()
    if (direction) {
        sort()
    } else {
        sortDescending()
    }
    return self
}
// 3
fun <R> Map<R, List<R>>?.mapByIndex(index: Int): Map<String, R?>? {
    return this?.mapKeys { it.key.toString() }
        ?.mapValues { it.value.getOrNull(index) }
}

// 4
fun Number.within(other: Number, deviation: Number): Boolean {
    val actual = toDouble() - other.toDouble()
    return actual.absoluteValue <= deviation.toDouble()
}
// 5
fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}
fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}
// 6
fun String.twitterize(authors: List<String>) {
    var counter = 0
    for (l in this) {
        println(authors[counter++])
        println(l.uppercase())
        println()
        if (counter >= authors.size) {
            counter = 0
        }
    }
}
 