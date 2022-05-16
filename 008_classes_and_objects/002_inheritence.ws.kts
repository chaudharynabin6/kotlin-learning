//All classes in Kotlin have a common superclass, Any,
// which is the default superclass for a class with no supertypes declared:

//By default, Kotlin classes are final – they can’t be inherited.
// To make a class inheritable, mark it with the open keyword:

open class Base1 // Class is open for inheritance

//
open class Base(p: Int)

class Derived(p: Int) : Base(p)


//If the derived class has no primary constructor,
// then each secondary constructor has to initialize the base type
// using the super keyword or it has to delegate to
// another constructor which does.
// Note that in this case different secondary constructors
// can call different constructors of the base type:

//class MyView : View {
//    constructor(ctx: Context) : super(ctx)
//
//    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
//}


//Overriding methods

open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}


//Overriding properties

open class Shape {
    open val vertexCount: Int = 0
}

class Rectangle : Shape() {
    override val vertexCount = 4
}

//you can also override a val property with a var property,
// but not vice versa.
// This is allowed because a val property essentially declares a get method,
// and overriding
// it as a var additionally declares a set method in the derived class.

interface Shape {
    val vertexCount: Int
}

class Rectangle(override val vertexCount: Int = 4) : Shape // Always has 4 vertices

class Polygon : Shape {
    override var vertexCount: Int = 0  // Can be set to any number later
}

//Derived class initialization order

//During the construction of a new instance of a derived class
// , the base class initialization is done as the first step (preceded only by evaluation of the arguments for the base class constructor), which means that
// it happens before the initialization logic of the derived class is run

//This means that when the base class constructor is executed,
// the properties declared or overridden in the
// derived class have not yet been initialized.


//Calling the superclass implementation

open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

//Code in a derived class can call its superclass
// functions and property accessor implementations using the super keyword:


//nside an inner class, accessing the superclass of
// the outer class is done using the super
// keyword qualified with the outer class name: super@Outer:

class FilledRectangle: Rectangle() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() { println("Filling") }
        fun drawAndFill() {
            super@FilledRectangle.draw() // Calls Rectangle's implementation of draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}") // Uses Rectangle's implementation of borderColor's get()
        }
    }
}