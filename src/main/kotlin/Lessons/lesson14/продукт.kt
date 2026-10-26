package org.example.Lessons.lesson14

data class Product(val name: String, val price: Double, val quantity: Int)
fun main() {
    val apple = Product("Apple", 0.5, 10)
    println(apple)
}
