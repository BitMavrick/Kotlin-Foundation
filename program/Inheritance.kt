package program

open class Animal( val name: String ){
    open fun describe(){
        println("This is a $name")
    }
}

class Dog(name: String, val breed: String) : Animal(name) {
    fun breed(){
        println("Breed : $breed")
    }
}

fun main(){
    val dog = Dog("Buddy", "Breed")
    dog.describe()
    dog.breed()
}