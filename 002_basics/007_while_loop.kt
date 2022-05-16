fun main(){

    val list = listOf("apple","banana","mango")
    // val index = 0  error: val cannot be reassigned
    var index = 0
    while(index < list.size){
        println("$index ${list[index]}")
        index++
    }
}

