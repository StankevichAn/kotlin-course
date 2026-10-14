val map1: Map<Int, Int> = mapOf()

val map2: Map<Float, Double> = mapOf(1.009f to 1.1)

val map3: MutableMap<Int, String> = mutableMapOf(2 to "2", 3 to "3")

fun main() {
    map3[1] = "string1"
    val map5 = map3[1]
    val map6 = map3[2]
    map3.remove(2)
    println(map6)
    map7_7()
    map3[3] = "4"
    map10["2"] = listOf(3)
    println(result11)
    result11?.add("3")
            println(map11)
}

val map7: Map<Double, Int> = mapOf(1.1 to 1, 2.2 to 2, 3.3 to 3)
fun map7_7(){
    for ((i, p) in map7){
        if(p == 0){
            println("inf")
        } else {
            val result = i / p
            println (result)
        }

    }
}

val map9 =  mapOf(1 to 1, 2 to 2, 3 to 3)
val map9_1 =  mapOf(4 to 4, 5 to 5, 6 to 6)
val map9_3: MutableMap<Int, Int> = mutableMapOf()

fun map9_4(){
    for((i, p)in map9) {
        map9_3[i] = p
    }
    for((i, p)in map9_1) {
        map9_3[i] = p
    }
}

val map10 = mutableMapOf("1" to listOf(1))

val map11 = mapOf(1 to mutableSetOf("1", "2"))

val result11 = map11[1]


val map12 = mapOf(
    Pair(1, 2) to "Первое значение",
    Pair(2, 3) to "Второе значение",
    Pair(5, 4) to "Третье значение (тут 5 на первом месте)",
    Pair(4, 5) to "Четвертое значение (тут 5 на втором месте)",
    Pair(6, 7) to "Пятое значение"
)

fun map12_1() {
    for ((i, p) in map12) {
        if (i.first == 5 || i.second == 5) {
            println(p)
        }
    }
}

//Задачи на подбор оптимального типа для словаря

val library1 = mapOf("автор книг" to mutableSetOf("name1", "name2"))

val plants = mapOf("Цветы" to mutableSetOf("Ромашки", "Васильки"), "Деревья" to mutableSetOf("Ива", "дуб"))

val sport = mapOf("team1" to listOf("player1", "player2"))

val pils = mapOf( "day1" to listOf("name1", "name2") )

val travelers = mapOf ("country" to mapOf("city" to listOf("places", "places")))