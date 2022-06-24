fun main(){

    /**
     * 1.1
     */
    print("Hello World")
    print("SDJ International College")
    println("message in new line")
    println("Another message")

    //Single line comment

    /**
     * Multiline comments
     */

    /**
     * 1.3 Variables
     */
    var name = "Nehal Patel"
    var age = 37

    println("My name is " + name)
    //println("My name is $name")
    println("I am $age years old")


    /**
     * 1.3.1 Variable datatype
     */
    var college:String = "SDJ International College"
    val established:Int = 2012
    var isAdmissionOpen:Boolean = false
    // var myInvalidInt:Int = "test";  //compile error


    //declare variable then assign value to it
    val address:String;
    address = "Vesu, Surat"

    // cannot declare variable without assigning datatype and value
    // var test //error
    // test = "something"

    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    val myByteNum: Byte = 100   //-128 to 127
    val myShortNum: Short = 5000 //-32768 to 32767
    val myIntNum: Int = 100000 //-2147483648 to 2147483647
    val myLongNum: Long = 15000000000L //-9223372036854775807 to 9223372036854775807
    val myFloatNum: Float = 5.75F
    val myDoubleNum2: Double = 19e4
    println("Double number $myDoubleNum2")

    //difference between var & val
    college = "SDJIC"
    // established = 2002 //error: cannot update val value
    // address = "Tithal Road, Valsad" //error

    //Type Conversion
    val x: Int = 5
    // val y: Long = x // Error: Type mismatch
    val y: Long = x.toLong()
    println("value of y is $y")

    //String
    var myName: String = "Nehal Patel"
    println(myName[0]) // 'N'
    println(myName[8]) // 't'
    println("length of string is $myName.length")

    println("length of string is ${myName.length}")
    //String functions
    println("length of string is ${myName.toUpperCase()}")
    println("length of string is ${myName.toLowerCase()}")

    //Compare
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    //Finding a String in a String
    var txt = "Please locate where 'locate' occurs!"
    println(txt.indexOf("locate"))  // Outputs 7

    // Quotes Inside a String
    var txt3 = "It's alright"
    var txt4 = "That's great"

    //String Concatenation
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)
    println(firstName.plus(lastName))
    println("My name is $firstName $lastName")

}