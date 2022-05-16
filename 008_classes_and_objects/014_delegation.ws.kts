// abstract methods are required for the delegation to work

interface Base {
    fun print()
//    https://stackoverflow.com/questions/50667221/when-using-class-delegation-is-there-a-way-to-override-members-used-by-methods#:~:text=When%20using%20class%20delegation%20in,implementations%20of%20the%20interface%20members.
     var y : Int
}

class BaseImpl(val x: Int) : Base {
    override var y: Int = -1
    override fun print() {
        print(x)
    }
}

class Derived(base:Base): Base by base{

    override fun print() {

        print("overridden ${this.y} ")

    }
}



val b = BaseImpl(10)
val d = Derived(b)
d.print()
d.y = 111
d.print()



