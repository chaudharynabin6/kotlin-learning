// 1. Create DTOs (POJOs/POCOs)
data class Customer(val name: String, val email: String)

var customer = Customer("Nabin Chaudhary","chaudharynabin6@gmail.com")

customer.name
customer.email


// 2. Default values for function parameters

fun foo(a: Int = 0, b: String = "") {
    println(a)
    println(b)
}
foo(100,"hello nabin")





// 3.  Filter a list
var list = listOf(1,2,4,5,6,7,-10,11)
val positives = list.filter { x -> x > 0 }
val greater_than = list.filter { it > 2 }
positives
greater_than


// 4. Check the presence of an element in a collection

var fruitList = listOf("banana","apple","grapes")
if ("apple" in fruitList)
{
    println("apple is present")
}


//5. String interpolation

var apple = "apple"
println("the fruit is $apple")


// 6. Instance checks
//val obj = " "
//when (obj) {
//    1 -> "One"
//    "Hello" -> "Greeting"
//    is Long -> "Long"
//    !is String -> "Not a string"
//    else -> "Unknown"
//}


// 7. Read-only map

//val map = mapOf("a" to 1, "b" to 2, "c" to 3)
//map["a"]

val map = mapOf("a" to 1, "b" to 2, "c" to 3)
map["c"]

// 8. Traverse a map or a list of pairs

for ((k, v) in map) {
    println("$k -> $v")
}

// 9. Iterate over a range

//for (i in 1..100) { ... }  // closed range: includes 100
//for (i in 1 until 100) { ... } // half-open range: does not include 100
//for (x in 2..10 step 2) { ... }
//for (x in 10 downTo 1) { ... }
//(1..10).forEach { ... }


