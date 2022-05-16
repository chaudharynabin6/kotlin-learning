//Overriding methods always use the same default parameter values as the base method.
// When overriding a method that has default parameter values, the default parameter
// values must be omitted from the signature:

open class A {
     var i:Int = -1
    open fun foo(i: Int = 10) {
        this.i = i
    }
}

class B : A() {
    override fun foo(i: Int) {
        this.i = i
    }  // No default value is allowed.
}


val b = B()
b.foo()
b.i

