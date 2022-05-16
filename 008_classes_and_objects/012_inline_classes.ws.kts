
//Moreover, if the wrapped type is primitive, the performance hit is terrible,
// because primitive types are usually heavily optimized by the runtime,
// while their wrappers don't get any special treatment.

//To solve such issues, Kotlin introduces a special kind of class called an inline class. Inline
@JvmInline
value class Password(private val s: String)

@JvmInline
value class Name(val s: String) {
    init {
        require(s.length > 0) { }
    }

    val length: Int
        get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}


val name = Name("Kotlin")
name.greet() // method `greet` is called as a static method
println(name.length) // property getter is called as a static method

