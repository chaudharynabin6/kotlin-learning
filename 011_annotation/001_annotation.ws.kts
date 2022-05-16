class Bar(){
    override fun toString(): String {
        return "Bar"
    }
}
@MustBeDocumented
annotation class Foo(val string: String)

@Foo("hello")
class Test
