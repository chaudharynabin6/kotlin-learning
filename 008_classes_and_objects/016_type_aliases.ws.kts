import javax.xml.crypto.NodeSetData

//https://kotlinlang.org/docs/type-aliases.html

typealias NodeSet = Set<NodeSetData<Int>>


// higher order function
typealias MyHandler = (Int, String, Any) -> Unit

