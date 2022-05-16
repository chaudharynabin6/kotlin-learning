//data classes for used for holding data
//It is not unusual to create classes whose main purpose is to hold data. I

//The primary constructor needs to have at least one parameter.
//
//All primary constructor parameters need to be marked as val or var.
//
//Data classes cannot be abstract, open, sealed, or inner.

data class Person(val firstName : String,val lastName : String ){
    lateinit var name : String
    init {
        this.name = this.firstName + " " + this.lastName
    }
var age = 0
}

val person = Person("Nabin","Chaudhary")

person.age
person.firstName
person.lastName
person.name
// destructuring data class instance
val (firstName,lastName) = person
firstName
lastName

val person2 = person.copy(firstName = "Naresh")
person2
person2.name