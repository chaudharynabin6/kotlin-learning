//You can mark a parameter of a function (usually the last one)
// with the vararg modifier:


fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

val list = asList(1, 2, 3)


//If you already have an array and want to pass its
// contents to the function, use the spread operator (prefix the array with *):

val a = arrayOf(1, 2, 3)
val list1 = asList(-1, 0, *a, 4)
list1

//If you want to pass a primitive type array into vararg,
// you need to convert it to a regular (typed) array using the toTypedArray() function:

val ab = intArrayOf(1, 2, 3) // IntArray is a primitive type array
//val list2 = asList(-1, 0, *ab, 4)
// Type mismatch: inferred type is IntArray but Array<out TypeVariable(T)> was expected
val list2 = asList(-1, 0, *ab.toTypedArray(), 4)

list2