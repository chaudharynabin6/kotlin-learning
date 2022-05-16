val p: String by lazy {
    // compute the string
    var str = ""
    (1..100).forEach{
        str += it.toString() + " "
    }
    str
}
p


// Creates an Array<String> with values ["0", "1", "4", "9", "16"]
val asc = Array(5) { i -> (i * i).toString() }
asc.forEach { print("$it ") }

val arr = IntArray(5){10}
arr.forEach { print("$it ") }

// creating multiline string
val multiLineStr = """
    Hello my name is nabin
    chaudhary
"""

multiLineStr


//As per the Java Language Specification,
//the methods in Java can return only one value at a time.
//So returning multiple values from a method is theoretically
//not possible in Java.
//fun multipleReturnType(a : Int, b : Int):Int,Double?{
//    var result : Double? = null
//    result = (a*b).toDouble()
//    return result
//}
//
//print(multipleReturnType(2,3))