// fun main(){

//     var list = listOf("apple","banana","grapes")

//     for(item in list){
//         println("$item")
//     }
// }

fun main(){
    var list = listOf("apple","banana","grapes")
    for(index in list.indices){
        println("$index ${list[index]}")
    }
}