//An interface with only one abstract method is called a functional interface,
// or a Single Abstract Method (SAM) interface.
// The functional interface can have several non-abstract members but
// only one abstract member.


fun interface KRunnable {
    fun invoke()
}


//SAM conversions


fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

// without SAM
// Creating an instance of a class
val isEven = object : IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}

// with SAM
// Creating an instance using lambda
val isEven1 = IntPredicate { it % 2 == 0 }

isEven1.accept(2)
fun interface SUM{
    fun logic( a : List<Int>):Int
}

val sum = SUM{ it.reduce { acc, i ->  acc+i  }
 }

sum.logic(listOf<Int>(1,2,10))

fun interface Perimeter{
    fun logic(a:Int,b:Int):Int
}

val rect = Perimeter{ a,b ->
        println("a: $a , b: $b")
        var result = a + b;
        result

}


rect.logic(1,2)