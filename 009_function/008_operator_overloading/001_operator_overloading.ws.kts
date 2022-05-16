class Example(var a : Int){

    operator  fun plus(b:Example):Example{
        return Example( this.a + b.a )
    }

    override fun toString(): String {
        return "Example a: $a"
    }
}

val e1 = Example(5)
val e2 = Example(2)
e1+e2

