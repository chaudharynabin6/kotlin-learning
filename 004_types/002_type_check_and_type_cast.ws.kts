
//is and !is operators
val obj = ""
if (obj is String) {
    print(obj.length)
}

if (obj !is String) { // same as !(obj is String)
    print("Not a String")
} else {
    print(obj.length)
}


//Smart casts

//the compiler tracks the is-checks



fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}
demo("")


fun automaticCast(){
    val x = " "
    // x is automatically cast to String on the right-hand side of `||`
    if (x !is String || x.length == 0) return

// x is automatically cast to String on the right-hand side of `&&`
    if (x is String && x.length > 0) {
        print(x.length) // x is automatically cast to String
    }
}

automaticCast()


// safe and unsafe cast operator safe>> as? << unsafe>> as <<
//unsafe cast throws null exception on failure

val y = 2
val x: String? = y as? String
x

val num = 2
//val string : String = num as String
//Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String