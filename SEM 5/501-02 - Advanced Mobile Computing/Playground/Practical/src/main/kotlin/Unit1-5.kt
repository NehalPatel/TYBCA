fun main(): Unit{

    /**
     * Array
     */
    var cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
    println("================================")

    cars[0] = "Opel"
    println(cars[0])
    println(cars.get(1))
    println("================================")

    //Array length
    println(cars.size)
    println("================================")

//     cars[4] = "Hyundai" //compile error, index out of bound
    // Loop Through an Array
    for (x in cars) {
        println(x)
    }
    println("================================")

    var mixedArray = arrayOf(1, 2, "Nehal", false)
    for (x in mixedArray){
        println(x)
    }
    var mixedArray2 = intArrayOf(1, 2, 3)
    println("================================")

    //Check if an Element Exists
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
    println("================================")

    //tradition for loop will not work
    //    for (int i=0; i <= car.size; i ++) {
    //        println(cars[i])
    //    }

//    var i: Int = 0
//    while (i <= cars.size) {
//        i += 2
//    }

    //Get distinct values from array
    val fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange", "Apple")
    val distinct = fruits.distinct()
    for( item in distinct ){
        println( item )
    }

    //drop element from array
    val result = fruits.drop(2) // drops first two elements.
    for( item in result ){
        println( item )
    }

    //Kotlin Ranges
    for (chars in 'a'..'x') {
        println(chars)
    }
    println("================================")

    for (i in 5..15 step 2) {
        println(i)
    }
    println("================================")

    for (i in (5..15).reversed() step 5) {
        println(i)
    }
    println("================================")

    for (i in 5 .. 1) {
        println(i)
    }

    for (i in 5 downTo 1) {
        println(i)
    }
    println("================================")

    //List
    val names = listOf("Nidhi", "Rahul", "Sumit")

    // Printing all the values of list names
    println("\nThe List contains: ")
    names.forEach {
        println(it)
    }
    println("================================")

    // names[0] = "Dev" //immutable list, wont compile
    names.forEach {
        println(it)
    }
    println("================================")

    var subjects = mutableListOf<String>("C++","RDBMS", "Java", "Python")
    subjects.forEach {
        println(it)
    }

    subjects.add("Mobile Development")
    subjects.remove("C++")
    subjects.forEach {
        println(it)
    }
}