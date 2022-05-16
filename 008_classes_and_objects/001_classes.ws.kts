class Person { /*...*/ }

class Empty

//----------------------------------------------------
//these are constructors parameter not the properties
class Person1 constructor(firstName: String) { /*...*/ }


//If the primary constructor does not have any annotations or
// visibility modifiers, the constructor keyword can be omitted:

class Person2(firstName: String) { /*...*/ }


//The primary constructor cannot contain any code. Initialization code
// can be placed in initializer blocks prefixed with the init keyword.


//During the initialization of an instance, the initializer blocks
// are executed in the same order as they appear in the class body,
// interleaved with the property initializers:

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

InitOrderDemo("hello")


//Primary constructor parameters can be used in the initializer blocks.
// They can also be used in property initializers declared in the class body:

class Customer(name: String) {
    val customerKey = name.uppercase()
}

//--------------------------------------------------------------
// initializing the properties from the constructors

class Person3(val firstName: String, val lastName: String, var age: Int) {}

// default parameter
class Person4(val firstName: String, val lastName: String, var isEmployed: Boolean = true)


class Person5(
    val firstName: String,
    val lastName: String,
    var age: Int, // trailing comma
) { /*...*/ }


//If the constructor has annotations or visibility modifiers,
// the constructor keyword is required and the modifiers go before it:

//class Customer4 public @Inject constructor(name: String) { /*...*/ }

// ----------------------------------------------------------
// secondary constructors
//https://www.youtube.com/watch?v=4i3bN80YkYM
class Student(var name: String){
    var id = -1
    init{
        println("name of student : $name and id : $id")

    }
    constructor(name:String,id:Int):this(name){
        this.id = 10
    }
    init{
        println("name of student : $name and id : $id")

    }

}

val s = Student("Nabin")
s.id


// beauty of secondary constructor
//class Person5(val name: String) {
//    val children: MutableList<Person> = mutableListOf()
//    constructor(name: String, parent: Person) : this(name) {
//        parent.children.add(this)
//    }
//}


//-------------------------------------------------

// instance of class

//val invoice = Invoice()

val customer = Customer("Joe Smith")

//Kotlin does not have a new keyword.


//abstract class vs open class
//An abstract member does not have an implementation in its class.
// You don't need to annotate abstract classes or functions with open.
abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw() {
        // draw the rectangle
    }
}


open class Polygon {
    open fun draw() {
        // some default polygon drawing method
    }
}

abstract class WildShape : Polygon() {
    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygon
    abstract override fun draw()
}

