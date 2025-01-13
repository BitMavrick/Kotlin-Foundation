package program

fun main(){
    for(i in 1 .. 3){
        println("i = $i")
        if(i == 2){
            continue // ? the loop will return from here "OK" will not be printed
            // * We can also perform labeled continue just like labeled break
        }
        println("ok")
    }
}