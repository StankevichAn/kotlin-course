fun main () {
    for (i in 1..5){
        println(i)
    }

    for (i in 1..10){
        if(i % 2 == 0) println(i)
    }

    for (i in 5 downTo 1){
        println(i)
    }

    for (i in 10 downTo 1){
        println(i/2)
    }
    for (i in 1..10 step 2){
        println(i)
    }
    for (i in 1..20 step 3){
        println(i)
    }
    var size = 20
    for (i in 3 until size step 2){
        println(i)
    }
    println("--------")
    var counter = 1
    while (counter <= 5){
        println(counter*counter)
        counter++
    }
    var counter2 = 10
    while (counter2 >= 5){
        println(counter2)
        counter2--
    }
    var counter3 = 5
    do {
        println(counter3)
    } while (counter3-- > 1)
    println("-----")

    var counter4 = 5
    do {
        println(counter4)
    } while (counter4++ < 10)

    for (i in 1..10){
        if (i == 6) break
        println(i)
    }
    var counter5 = 1
    while (counter5 < 500){
        if (counter5 == 10) {
            break
        }
        println(counter5)
        counter5++
    }
    for (i in 1..10){
        if (i % 2==0) continue
        println(i)
    }
    println("--------")
    var counter6 = 0
    while (counter6 < 10){
        counter6++
        if (counter6 % 3 == 0 ) continue
        println(counter6)

    }
}