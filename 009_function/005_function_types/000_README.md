# function type signature

* () -> R
* (A,B) -> R
* R.(A.B) -> R : R. is receiver type may be string , number , list
* To specify that a function type is nullable, use parentheses as follows: ((Int, Int) -> Int)?.
* Function types can also be combined using parentheses: (Int) -> ((Int) -> Unit)
* You can also give a function type an alternative name by using a type alias:
  * ```typealias ClickHandler = (Button, ClickEvent) -> Unit```

# Instantiating function type

There are several ways to obtain an instance of a function type:

1. Use a code block within a function literal, in one of the following forms:

   * a lambda expression: { a, b -> a + b }, 
   * an anonymous function: fun(s: String): Int { return s.toIntOrNull() ?: 0 }

Function literals with receiver can be used as values of function types with receiver.

2. Use a callable reference to an existing declaration:

    * a top-level, local, member, or extension function: ::isOdd, String::toInt,
    
    * a top-level, member, or extension property: List<Int>::size,
    
    * a constructor: ::Regex

These include bound callable references that point to a member of a particular instance: foo::toString.