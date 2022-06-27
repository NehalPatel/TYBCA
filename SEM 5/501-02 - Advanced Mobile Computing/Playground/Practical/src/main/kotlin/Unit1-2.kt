fun main(): Unit{

    var num = 2;

    //Only if
    if(num % 2 == 0) {
        println("Even number")
    }

    //if-else
    if(num % 2 == 0) {
        println("Even number")
    } else {
        println("Odd number")
    }

    //if, else-if, else
    if(num < 5) {
        println("Number is less than 5")
    } else if(num == 5){
        println("Number is 5")
    } else {
        println("Number is grater than 5")
    }

    //if else return value
    val num1 = 10
    val num2 =20
    val result = if (num1 > num2) {
        "$num1 is greater than $num2"
    } else {
        "$num1 is smaller than $num2"
    }

    println(result)


    /**
     * When example
     */

    var number = 4
    when(number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("invalid number")
    }

    //Multiple Statement of when Using Braces
    when(number) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }

    //Multiple branches of when
    when(number) {
        3, 4, 5, 6 ->
            println("It is summer season")
        7, 8, 9 ->
            println("It is rainy season")
        10, 11 ->
            println("It is autumn season")
        12, 1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    }

    // Using when in the range
    when(number) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
}