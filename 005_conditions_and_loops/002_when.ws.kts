

val a = 1;

when(a){
    1 -> print("one")
    2 -> print("two")
    else -> print("other")
}

enum class Day{
    sunday,monday,tuesday,wednesday,thrusday,friday,saturday
}

val day = Day.sunday
when(day){
    Day.sunday -> print("sunday")
    Day.monday -> print("monday")
    Day.tuesday -> print("tuesday")
    Day.wednesday -> print("wednesday")
    Day.thrusday -> print("thursday")
    Day.friday -> print("friday")
    Day.sunday -> print("saturday")
}


when(1){
    1,2 -> print("one or two")
}
var x = 2;
val validNumbers = (1..100)
when (x) {
    in 1..10 -> print("x is in the range")
    in validNumbers -> print("x is valid")
    !in 10..20 -> print("x is outside the range")
    else -> print("none of the above")
}

//
//when can also be used as a replacement for an if-else if chain.
//If no argument is supplied, the branch conditions
//are simply boolean expressions,
//and a branch is executed when its condition is true:

x = 2
when{
    x == 1 -> print("one")
    x == 2 -> print("two")
    else -> print("three")
}

// useful example
fun Request.getBody() =
    when (val response = executeRequest()) {
        is Success -> response.body
        is HttpError -> throw HttpException(response.status)
}