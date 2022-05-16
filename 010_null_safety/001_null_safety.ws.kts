var a : String? = null


//a.length
//Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

// null safe operator
a?.length

// null safe with elvis operator
// if null executes later
a?.length ?: println("elvis null")

// not null assertion operator
try {
    val len = a!!.length
    print("here")
}
catch ( e : NullPointerException){
    println(e.localizedMessage)
    println("null pointer Exception")
}

// safe cast

val b = 2.0

val bInt : Int? = b as? Int
bInt