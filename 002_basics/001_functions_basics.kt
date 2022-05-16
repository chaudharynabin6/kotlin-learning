fun main() {
    // printing hello world
    println("Hello world!")

    // function 
    println("function with input and output type annotation :"+sum(1,2))

    // function with type annotation
    println("function with infered return type:"+sum(1,2,3))

    // function returns Unit
    printSum(1,2)

}
// info: functions 
// Type annotation is necessary on input paramter as well as
// return value
fun sum(a : Int, b : Int):Int{
    return a+b
}

// info: function with type annotation
// note: function overloading is supported
// return type is inferred

fun sum(a:Int,b:Int,c:Int) = a + b + c

// info: function returns no useful value
// function return type is Unit if no return type
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}