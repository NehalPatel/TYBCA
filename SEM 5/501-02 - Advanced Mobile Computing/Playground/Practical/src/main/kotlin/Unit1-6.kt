fun main(){

    val marks = arrayOf(80,85,60,90,70)

    //for loop
    println("===for loop=============================")
    for(item in marks){
        println(item)
    }

    //while loop
    println("===while loop=============================")
    var i = 1
    while (i<=5){
        println(i)
        i++
    }

    //do while loop
    println("===do while loop=============================")
    var j = 1
    do {
        println(j)
        j++
    }
    while (j<=5);

    //break statement
    println("===break statement=============================")
    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }

    //break to the loop
    println("====break to the loop============================")
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2)
                break@loop
        }
    }

    //continue example
    println("===continue example=============================")
    for (i in 1..3) {
        println("i = $i")
        if (i == 2) {
            continue
        }
        println("this is below if")
    }

    println("===label with continue statement=============================")
    //label with continue statement
    start@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2) {
                continue@start
            }
            println("this is below if")
        }
    }

    //functions
    println("===functions=============================")
    var number = 25
    var result = Math.sqrt(number.toDouble())
    println("Square root of $number is $result")

    //User defined functions
    println("===User Defined Functions=============================")
    var answer = sum(10, 20)
    println(answer)

    //pass function as argument
    println("===pass function as argument=============================")
    answer = calculate(30, 70, ::sum)
    println(answer)

    //lambda function
    println("===lambda function=============================")
    val myPrint: (Int) -> Unit= { s: Int -> println(s) }
    addNumber(5,10, myPrint)
}

fun sum(num1:Int, num2:Int) : Int{
    return num1 + num2
}

//fun sum(num1:Int, num2:Int) : Int = num1 + num2

fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
    return operation(a, b)
}

fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){
    val add = a + b
    mylambda(add) // println(add)
}