
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5
val numbers = Array(5) { index -> index + 1 }
val numbersView = numbers.joinToString(separator = "")

val t2: Array<String> = Array(10) {""}

val t3 = DoubleArray(5) { index -> (index * 2).toDouble() }

val t4: Array<Int> = arrayOf(1, 2, 3, 4, 5)
fun t4_1( ) {
    for(i in t4.indices){
        t4[i] = (i+1)*3
    }
    val t4View = t4.joinToString(separator = ", ")
    println(t4View)
}

val t5: Array<String?> = arrayOf(null, "Котлин", "Привет")

val t6: Array<Int> = arrayOf(1, 2, 3, 4, 5,)
val t6_copie: Array<Int?> = arrayOfNulls<Int>(5)
fun t6_1( ) {
    for(i in t6.indices){
        t6_copie[i] = t6[i]
    }
    val t6View = t6.joinToString(separator = ", ")
    println(t6View)
}

val t7: Array<Int> = arrayOf(1, 2, 3, 4, 5,)
val t7_1: Array<Int> = arrayOf(1, 2, 3, 4, 4)
var t7_result: Array<Int?> = arrayOfNulls<Int>(5)

fun t7_fun (){
    for (i in t7.indices ) {
        t7_result[i] = t7[i] - t7_1[i]
    }
    val t7View = t7_result.joinToString(separator = ", ")
    println(t7View)
}

val t8: Array<Int> = arrayOf(1, 2, 3, 4, 5,)

fun t8_fun (){
    var counter = 0
    var foundIndex = -1
    while(counter < t8.size){
        if (t8[counter] == 5) {
            foundIndex = counter
            break
        }
        counter ++
    }
    println(foundIndex)
}

val t9: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

fun t9_fun (){
    for (i in t9) {
        if(i % 2 == 0) {
            println("$i — чётное")
        }
        else if (i % 2 != 0) {
            println("$i — нечётное")
        }
    }
}

val library = arrayOf("Котлин")
fun t10(array: Array<String>, searchString: String) {

    for (item in array) {


        if (item.contains(searchString)) {


            println("Найдено совпадение: $item")
        }
    }
}

val List: List<Int?> = listOf()
val List2: List<String> = listOf("Hello", "World", "Kotlin")
val List2_2: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
val List3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

fun list_3(){
    List3.add(6)
    List3.add(7)
    List3.add(8)
    val result = List3.joinToString(separator = ", ")
    println(result)
}

fun list_2(){
    List2_2.removeAt(1)
    println(List2_2)
}

val List6: List<Int> = listOf(1, 2, 3, 4, 5)
fun list_6(){
    for(i in List6){
        if(i<= 4) println(i)
    }
}

val List7: List<String> = listOf("Hello", "World", "Kotlin")

fun list_7(){
    val secondElement = List7[1]
    println(secondElement)
}

val List8: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
fun list_8(){
    List8[2] = 1
}

val List9: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
val List9_1: MutableList<String> = mutableListOf("Hi", "Wo", "Ko")
val List9_2: MutableList<String?> = mutableListOf()
fun list_9(){
    for (word in List9) {
        List9_2.add(word)
    }
    for (word in List9_1) {
        List9_2.add(word)
    }
    println(List9_2.joinToString(separator = ", "))
}

val List10: List<Int> = listOf(1,2, 3, 4, 5, 6, 7)
var max = List10[0]
var min = List10[0]

fun list_10(){
    for (num in List10) {
        if(num > max){
            max = num
        }
        if (num < min) {
            min = num
        }
    }
    println(max)
    println(min)
}


val List11: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
val List11_1: MutableList<Int?> = mutableListOf()
fun list_11(){
    for (num in List11) {
        if(num % 2 == 0){
            List11_1.add(num)
        }
    }
    println(List11_1.joinToString ( separator = "," ))
}

val Set1: Set<Int> = emptySet()
val Set2: Set<Int> = setOf(1, 2, 3, 4, 5)
val Set3: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
val Set4: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

fun Set4(){
    Set4.add("Swift")
    Set4.add("Go")
    println(Set4.joinToString ( separator = "," ))
}

val Set5: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
fun Set5_5(){
    Set5.remove(2)
    println(Set5.joinToString ( separator = "," ))
}

val Set6: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
fun Set6_1(){
    for (i in Set6){
        println(i)
    }
}

val Set7: MutableSet<String> = mutableSetOf("1","2", "3", "4", "5")
val set7_string = "1"
fun Set7_1(){
    var isFound = false
    for (i in Set7){
        if(i == set7_string){
            isFound = true
            break
        } else {
            println(message = false)
        }
    }
    println(isFound)
}

val set8: Set <String> = setOf("1", "2", "3", "4")
val set8_1: MutableSet<String?> = mutableSetOf()

fun set8_8(){
    for(i in set8){
        set8_1.add(i)
    }
    println(set8_1.joinToString ( separator = "," ))
}

fun main(){
    println (numbersView)
    println(t3.joinToString(separator = ", "))
    t4_1( )
    t6_1( )
    t7_fun ()
    t8_fun ()
    t9_fun ()
    t10(library, "Кот")
    list_3()
    list_2()
    list_6()
    list_7()
    list_9()
    list_10()
    list_11()
    Set4()
    Set5_5()
    Set6_1()
    Set7_1()
    set8_8()
}
