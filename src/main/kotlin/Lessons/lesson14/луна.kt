package org.example.Lessons.lesson14

object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"
    fun showPhase() {
        if (isVisible) {
            println("The moon is visible, and it's currently a $phase.")
        } else {
            println("The moon is not visible right now.")
        }
    }
}
fun main() {
    Moon.showPhase()  // The moon is visible, and it's currently a Full Moon.
}