//https://kotlinlang.org/docs/lambdas.html#lambda-expression-syntax

val sum : (Int,Int) -> Int = {
    a,b ->
    a+b
}

sum(1,2)

val intSum = {a:Int,b:Int -> a+b}

intSum(3,4)


// return in lambda
fun foo(x:Int,isEven : (Int) -> Boolean){
    print(isEven(x))
}

foo(2){
    if(it % 2 == 0) {
        return@foo true
    }

    return@foo false
}

