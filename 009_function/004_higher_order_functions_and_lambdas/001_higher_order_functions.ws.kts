fun foo(a : Int, b : Int, bar: (x: Int,y : Int)-> Unit){
    bar(a,b)
}

foo(
    1,2,
    {
        x:Int,y:Int ->
        print("x : $x, y: $y \n")
    }
)