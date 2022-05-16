fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

//fun MutableList<Int>.swap(index1: Int, index2: Int) {
//    val tmp = this[index1] // 'this' corresponds to the list
//    this[index1] = this[index2]
//    this[index2] = tmp
//}

val m = mutableListOf<Int>(1,2,3,4)
m
m.swap(0,1)
m


//Extensions are resolved statically
//Extension properties

val <T> List<T>.lastIndex: Int
    get() = size - 1

//Companion object extensions

//Scope of extensions
//To use an extension outside its declaring package, import it at the call site:


//Declaring extensions as members
