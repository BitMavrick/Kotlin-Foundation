package program

fun main(){
    val myLambda : (Int) -> Unit = { s: Int -> println(s) }
    addNumber(5, 10, myLambda)

    val welcome : (String) -> Unit = { name : String -> println(name) }
    welcome("Mehedi Hasan", welcome)
}

fun welcome(
    name : String,
    welcome : (String) -> Unit
){
    welcome("Welcome $name")
}

fun addNumber(
    a : Int,
    b : Int,
    myLambda : (Int) -> Unit
){
    val add = a + b
    myLambda(add)
}