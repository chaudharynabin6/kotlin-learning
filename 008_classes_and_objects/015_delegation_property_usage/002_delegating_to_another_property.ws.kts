var topLevelInt: Int = 0
class ClassWithDelegate(val anotherClassInt: Int)

class MyClass(var memberInt: Int, val anotherClassInstance: ClassWithDelegate) {
    var delegatedToMember: Int by this::memberInt
//    var delegatedToTopLevel: Int by ::topLevelInt

    val delegatedToAnotherClass: Int by anotherClassInstance::anotherClassInt
}
//var MyClass.extDelegated: Int by ::topLevelInt

val  c = MyClass(1,ClassWithDelegate(1))

c.delegatedToMember


// used for api changes

//class MyClass {
//    var newName: Int = 0
//    @Deprecated("Use 'newName' instead", ReplaceWith("newName"))
//    var oldName: Int by this::newName
//}
//fun main() {
//    val myClass = MyClass()
//    // Notification: 'oldName: Int' is deprecated.
//    // Use 'newName' instead
//    myClass.oldName = 42
//    println(myClass.newName) // 42
//}