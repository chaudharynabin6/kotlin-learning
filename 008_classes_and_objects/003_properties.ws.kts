class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}


// getter and setters

class Rectangle(val width: Int, val height: Int) {
    val area: Int // property type is optional since it can be inferred from the getter's return type
        get() = this.width * this.height
    var rating: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
}

val rectangle = Rectangle(3, 4)
println("Width=${rectangle.width}, height=${rectangle.height}, area=${rectangle.area}")

rectangle.rating = "hello"
rectangle.rating


//Compile-time constants

//It must be a top-level property, or a member of an object declaration or a companion object.
//
//It must be initialized with a value of type String or a primitive type

