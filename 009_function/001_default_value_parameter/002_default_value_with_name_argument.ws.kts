//If a default parameter precedes a parameter with no default value,
// the default value can only be used by calling the function with named arguments:

fun foo(
    bar: Int = 0,
    baz: Int,
) {
    print("bar : $bar , baz : $baz    ")
}

foo(baz = 1) // The default value bar = 0 is used

foo(1,2)