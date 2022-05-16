// fun describe(obj: Any): String =
//     when (obj) {
//         1          -> "One"
//         "Hello"    -> "Greeting"
//         is Long    -> "Long"
//         !is String -> "Not a string"
//         else       -> "Unknown"
//     }

// fun main() {
//     println(describe(1))
//     println(describe("Hello"))
//     println(describe(1000L))
//     println(describe(2))
//     println(describe("other"))
//     println(describe(300))
// }

fun elseIf(obj:Any):Unit{
// https://www.geeksforgeeks.org/kotlin-when-expression/
    when(obj){
        1 -> {
            println("one")
            println(obj)
        }
        2 -> {
            for(i in 1..2){
                println(i)
            }
        }
        
    }
}

fun main(){
    elseIf(1)
    elseIf(2)
}