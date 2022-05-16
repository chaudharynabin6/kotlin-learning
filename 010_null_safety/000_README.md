# Null safety

* null is a reference type and its value is the only reference value which doesn't refer to any object
* exception offers when you call method on null reference called Null Pointer Exception


## various cases of null pointer Exception

https://kotlinlang.org/docs/null-safety.html#nullable-types-and-non-null-types

## solution for null pointer exception
* checking null condition not well solution
* safe calls : without what to do if null
* elvis operator : ?: : with what to do if null
* the !! (assertion) operator : null pointer lover
* safe cast : as?