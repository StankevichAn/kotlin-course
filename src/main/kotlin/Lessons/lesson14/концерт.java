package Lessons.lesson14;

class Concert(val band: String, val location: String, val cost: Int, val capacity: Int) {

    private var ticketSold = 0

    fun buyTicket() {
        if (ticketSold < capacity) {
            ticketSold++
        }
    }

    fun printDetails() {
        println("Концерт группы $band в $location. Стоимость билета $cost. Осталось ${capacity - ticketSold} мест")
    }
}
fun main() {
    val concert = Concert("The Beatles", "Madison Square Garden", 5000, 1000)
    concert.printDetails()
    concert.buyTicket()
    concert.printDetails()
}