

// ------------------------------------------ video reference----------------------------------
//https://www.youtube.com/watch?v=yuJNXSZFET8
//------------------------------------------- video reference --------------------------------

class  Box<T>( a : T){
    var value = a
}

val stringBox = Box("NAME")
stringBox.value

Box(1).value
Box(arrayListOf(1,2,3,4)).value
//https://www.youtube.com/watch?v=fpDCUvNZI9E
//https://typealias.com/concepts/type-projection/

// invariance : means no upper bound and lower bound  type should be matched
// uppper bound : out  meaning that you can use type safely with given upper bound class : co-variant
// lower bound : in  meaning that you can use type safely with given lower bound class : contravariant
// * -projection : for defining lower and upper bound by default

//interface Function<in T, out U> you could use the following star-projections:
//
//Function<*, String> means Function<in Nothing, String>.
//
//Function<Int, *> means Function<Int, out Any?>.
//
//Function<*, *> means Function<in Nothing, out Any?>.

//https://agrawalsuneet.github.io/blogs/difference-between-any-unit-and-nothing-kotlin/