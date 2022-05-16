

//---------------------------------------------------------
//working with collections
val collection = mutableListOf<Int>()
collection.size
collection.add(1)
collection.add(2)
collection.add(3)
collection.add(10)
for (item in collection) println(item)

//----------------------------------


// working with array
val array = Array(10,{
    (it*2).toString() + " table"
})
for ((index, value) in array.withIndex()) {
    println("the element at $index is $value")
}


// while and do while loops
val a = 10
var i = 0
while(i  < a){
    print("$i ")
    i++
}

