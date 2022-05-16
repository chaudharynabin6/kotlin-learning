val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

lazyValue
lazyValue


class HeavyWork{
    init {
        println("Heavy Work")
    }
}

class Student{

    val lazyWork : HeavyWork by lazy{ HeavyWork()}
}

val s = Student()

s.lazyWork
s.lazyWork
s.lazyWork