//https://www.youtube.com/watch?v=rWPqjr1ZmQU&t=226s
//https://www.youtube.com/watch?v=ov7d_iCa0bg

//------------------------------
//simple example

import kotlin.reflect.KProperty
class Example {
    var p: String by Delegate()
}



class Delegate {
    var formatedValue : String = ""
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return "$thisRef, thank you for delegating '${property.name}' to me!"
        return formatedValue

    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
        if(value != null && value.length >= 2){
            formatedValue = value.trim().lowercase()
        }
    }
}


val e = Example()
e.p = "A"
e.p

e.p = "AB"
e.p





