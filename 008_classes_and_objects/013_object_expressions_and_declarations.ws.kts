//Sometimes you need to create an object that is a slight modification of some class,
// without explicitly declaring a new subclass for it.
// Kotlin can handle this with object expressions and object declarations.


//===========================================================
//object expressons

/*
* Object expressions create objects of anonymous classes,
* that is, classes that aren't explicitly declared with the class declaration.
* Such classes are useful for one-time use. You can define them from scratch, inherit from existing classes,
*  or implement interfaces. Instances of anonymous classes are also called anonymous objects
*  because they are defined by an expression, not a name.
*
* */

//--------------------------------------------------
//Creating anonymous objects from scratch

//Yes, this is normal. If you use an anonymous object as part of the public API of a class,
// the type of the corresponding property is the base type of the anonymous object ( in this case),
// and you can’t access any members which are not defined in the base type.

val helloWorld = object {
    public val hello = "Hello"
    val world = "World"
    // object expressions extend Any, so `override` is required on `toString()`
    override fun toString() = "$hello $world"
}
print(helloWorld)
//helloWorld.getHello() error: Unresolved reference: getHello


//-------------------------------

//Inheriting anonymous objects from supertypes

open class A(x: Int) {
    public open val y: Int = x
}

interface B { /*...*/ }

val ab: A = object : A(1), B {
    override val y = 15
}

ab.y

//Using anonymous objects as return and value types

interface A {
    fun funFromA() {}
}
interface B

class C {
    // The return type is Any. x is not accessible
    fun getObject() = object {
        val x: String = "x"
    }

    // The return type is A; x is not accessible
    fun getObjectA() = object: A {
        override fun funFromA() {}
        val x: String = "x"
    }

    // The return type is B; funFromA() and x are not accessible
    fun getObjectB(): B = object: A, B { // explicit return type is required
        override fun funFromA() {}
        val x: String = "x"
    }
}


//Accessing variables from anonymous objects

//The code in object expressions can access variables from the enclosing scope:

fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }

        override fun mouseEntered(e: MouseEvent) {
            enterCount++
        }
    })
    // ...
}


//===========================================================================================
// object declaration

//The Singleton pattern can be useful in several cases, and Kotlin makes it easy to declare singletons:

object DataProviderManager {
    fun registerDataProvider(provider: DataProvider) {
        // ...
    }

    val allDataProviders: Collection<DataProvider>
        get() = // ...
}

//To refer to the object, use its name directly:

DataProviderManager.registerDataProvider(...)

//Such objects can have supertypes:
object DefaultListener : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) { ... }

    override fun mouseEntered(e: MouseEvent) { ... }
}


//====================================================

//Companion objects

//An object declaration inside a class can be marked with the companion keyword:

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

//Members of the companion object can be called simply by using the class name as the qualifier:

val instance = MyClass.create()

//name : The name of the companion object can be omitted, in which case the name Companion will be used:

class MyClass {
    companion object { }
}

val x = MyClass.Companion


//The name of a class used by itself (not as a qualifier to another name)
// acts as a reference to the companion object of the class (whether named or not):

class MyClass1 {
    companion object Named { }
}

val x = MyClass1

class MyClass2 {
    companion object { }
}

val y = MyClass2

//Note that even though the members of companion objects look like static members in other languages,
// at runtime those are still instance members of real objects, and can, for example, implement interfaces:

interface Factory<T> {
    fun create(): T
}

class MyClass {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}

val f: Factory<MyClass> = MyClass