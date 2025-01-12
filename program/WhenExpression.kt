package program

fun main(){
    var number = 3;
    var providedNumber = when(number){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "Unknown"
    }

    println("The value is $providedNumber")
}