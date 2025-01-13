package program

var count = 0

fun main(){
    rec()
}

fun rec(){
    count ++
    if(count <= 5){
        println(count)
        rec() // Calling recursion
    }
}