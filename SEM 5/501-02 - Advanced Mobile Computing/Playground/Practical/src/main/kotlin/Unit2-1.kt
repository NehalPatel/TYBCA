fun main(args: Array<String>) {
    val obj = myClass() // Create object obj of myClass class
    obj.printMe() // Call a member function using object

    println("=========================")
    //secondary constructor
    val a = Animal("Tiger", 4)
    a.printMe()

    println("=========================")
    //primary constructor
    val p = Person("Nehal", 37)
    p.printMe()
}

class myClass {
    // Property (data member)
    private var name: String = "SDJ International College"

    // Member function
    fun printMe() {
        println("My College name is: " + name)
    }
}

//Primary constructor
class Animal {
    private var name: String
    private var legs: Int

    constructor(name: String, legs: Int = 2){
        this.name = name
        this.legs = legs

        println("I am called from constructor")
    }

    init {
        println("I am called from init block")
    }

    fun printMe(){
        println("${this.name} have ${this.legs} legs")
    }
}

class Person constructor(val name:String, val age:Int) {

    init {
        println("Person name is : $name")
        println("Person age is : $age")
    }

    fun printMe(){
        println("Age of $name is $age")
    }
}

class Employee{
    // Member Variables
    var name: String
    var age: Int
    var salary:Double

    // First Secondary Constructor
    constructor ( _name: String, _age: Int) {
        this.name = _name
        this.age = _age
        this.salary = 0.00
        println("Name = $name")
        println("Age = $age")
    }

    // Second Secondary Constructor
    constructor ( _name: String, _age: Int, _salary: Double) {
        this.name = _name
        this.age = _age
        this.salary = _salary
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }
}