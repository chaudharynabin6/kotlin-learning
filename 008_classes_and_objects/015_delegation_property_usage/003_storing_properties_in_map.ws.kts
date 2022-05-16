class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

val user = User(mapOf(
    "name" to "John Doe",
    "age"  to 25
))


println(user.name) // Prints "John Doe"
println(user.age)  // Prints 25





//This also works for var’s properties if
// you use a MutableMap instead of a read-only Map:

class MutableUser(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int     by map
}



\