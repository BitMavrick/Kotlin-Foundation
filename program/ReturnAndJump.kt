package program

fun main(){
    for(i in 1 .. 10){
        if(i == 5){
            break // Simple break
        }
        println(i)
    }

    loop1@ for(i in 1 .. 10){
        loop2@ for(j in 20 .. 25){
            if(j == 22){
                break@loop1 // Kotlin Labeled break Expression : You can define which loop to break
            }
            println("i = $i and j = $j")
        }
    }
}