## Class members
Classes can contain:

* Constructors and initializer blocks

* Functions

* Properties

* Nested and inner classes

* Object declarations


## calling base class functionality

super() : constructor

super.member

## overriding rule

In Kotlin, implementation inheritance is regulated by the following rule: 
if a class inherits multiple implementations of the same member from its 
immediate superclasses, it must override this member 
an d provide its own implementation (perhaps, using one of the inherited ones).
To denote the supertype from which the inherited implementation is taken, 
use super qualified by the supertype name in angle brackets, such as super<Base>:
```kotlin
open class Rectangle {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}

```

It's fine to inherit from both Rectangle and Polygon,
but both of them have their implementations of draw(), so you need to override draw() in Square and 
provide a separate implementation for it to eliminate the ambiguity.


## Late-initialized properties and variables
Normally, properties declared as having a non-null type must be initialized
in the constructor.
However, it is often the case that doing so is not convenient.

To handle such cases, you can mark the property with the lateinit modifier:

Checking whether a lateinit var is initialized

```kotlin
if (foo::bar.isInitialized) {
    println(foo.bar)
}
```

# usage of arrow operator

https://stackoverflow.com/questions/42646016/what-does-the-arrow-operator-do-in-kotlin

The -> is a separator. It is special symbol used to separate code with different purposes. It can be used to:

Separate the parameters and body of a lambda expression

```kotlin
val sum = { x: Int, y: Int -> x + y }
```
Separate the parameters and return type declaration in a function type

```
(R, T) -> R
```
Separate the condition and body of a when expression branch

```kotlin
when (x) {
0, 1 -> print("x == 0 or x == 1")
else -> print("otherwise")
}  
```