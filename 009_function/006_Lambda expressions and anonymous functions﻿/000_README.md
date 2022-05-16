## Lambda expression syntax

The full syntactic form of lambda expressions is as follows:
```
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
```
A lambda expression is always surrounded by curly braces.

Parameter declarations in the full syntactic form go inside curly braces and have optional type annotations.

The body goes after the ->.

If the inferred return type of the lambda is not Unit, the last (or possibly single) expression inside the lambda body is treated as the return value.

If you leave all the optional annotations out, what's left looks like this:

```
val sum = { x: Int, y: Int -> x + y }
```

## Passing trailing lambdas

According to Kotlin convention, if the last parameter of a function is a function, then a lambda expression passed as the corresponding argument can be placed outside the parentheses:

```
val product = items.fold(1) { acc, e -> acc * e }
```
Such syntax is also known as trailing lambda.

If the lambda is the only argument in that call, the parentheses can be omitted entirely:

```
run { println("...") }
```

This convention, along with passing a lambda expression outside of parentheses, allows for LINQ-style code:

```
strings.filter { it.length == 5 }.sortedBy { it }.map { it.uppercase() }
```

## it: implicit name of a single parameter

It's very common for a lambda expression to have only one parameter.

If the compiler can parse the signature without any parameters, the parameter does not need to be declared and -> can be omitted. The parameter will be implicitly declared under the name it:

```
ints.filter { it > 0 } // this literal is of type '(it: Int) -> Boolean
```

## Returning a value from a lambda expression


## Underscore for unused variables
If the lambda parameter is unused, you can place an underscore instead of its name:

```
map.forEach { _, value -> println("$value!") }
```

## Anonymous functions

In most cases, this is unnecessary because the return type can be inferred automatically. However, if you do need to specify it explicitly, you can use an alternative syntax: an anonymous function.


```kotlin
ints.filter(fun(item) = item > 0)

fun(x: Int, y: Int): Int {
    return x + y
}

fun(x: Int, y: Int): Int = x + y
```