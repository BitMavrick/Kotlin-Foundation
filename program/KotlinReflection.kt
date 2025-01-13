package program

class MyClass(val name: String, var age: Int)

fun main(){
    val myClass = MyClass("Alice", 25)
    val kClass = myClass::class

    kClass.members.forEach{ member ->
        println(member.name)
    }
}