//function signature

fun foo(bar:()->Int):Int{

    val a = bar()
    return  a
}

val a =foo{
    1
}
print(a)

// this is function
val bar = { i:Int -> print(i)}

// this is function taking argument as function
fun foo(bar:(i:Int) -> Unit){
    bar(1)
}

foo(bar)


// function with receiver type
val sum: Int.(Int) -> Int = { other -> plus(other) }

val a = 1

sum(1,2)


//  instances of a custom class that implements a function type as an interface

class IntTransformer: (Int) -> Int {
    override operator fun invoke(x: Int): Int {
        return x
    }
}

val intFunction: (Int) -> Int = IntTransformer()

intFunction(10)

//literal vs non literal
//https://stackoverflow.com/questions/48411196/what-is-the-difference-between-literals-and-non-literals-other-than-the-fact-th

//Non-literal values of function types with and without a receiver are interchangeable,
// so the receiver can stand in for the first parameter, and vice versa. For instance,
// a value of type (A, B) -> C can be passed
// or assigned where a value of type A.(B) -> C is expected, and the other way around:

val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
val twoParameters: (String, Int) -> String = repeatFun // OK

fun runTransformation(f: (String, Int) -> String): String {
    return f("hello", 3)
}
val result = runTransformation(repeatFun) // OK

println("result = $result")