package program

fun main(){
    inlineFunction(
        {
            println("hello")
            return
        },
        { println("World") }
    )
}

inline fun inlineFunction(
    myFun: ()-> Unit,
    myFun2: () -> Unit
){
    myFun()
    myFun2()
    print("code inside inline function")
}