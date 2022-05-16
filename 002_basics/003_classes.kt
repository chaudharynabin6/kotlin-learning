// class Rectangle(var height: Double, var length: Double) {
// this is called declaration block
//  where we can pass parameter to default constructor whis is used as properties
// we use var single they are properties

// class Rectangle(var height: Double, var length: Double) {
//     var perimeter = (height + length) * 2 
// }
fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}


open class Shape

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}