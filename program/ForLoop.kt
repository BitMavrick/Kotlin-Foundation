package program

fun main(){
    val numbers = arrayOf(1, 3, 5, 7, 9)

    for(number in numbers){
        println(number) // it will give the value
    }

    for(item in numbers.indices){
        println(item) // it wil give the index number
    }

    for(num in 1 ..5){
        println(num) // it will print 1 to 5
    }

    for(num in 5 .. 1){
        println(num) // ! It prints nothing, its a wrong approach
    }

    for(num in 5 downTo 1){
        println(num) // it will print 5 to 1
    }

    for(num in 1 .. 10 step 3){
        println(num) // it will take 3 step in one loop value will be 1, 4, 7, 10
    }

    for (num in 10 downTo 1 step 3){
        println(num) // The value will be 10, 7, 4, 1
    }

}