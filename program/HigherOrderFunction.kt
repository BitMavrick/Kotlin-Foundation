package program

fun main(){
    val fn:(String,String)->String={org1,portal1->"$org1 develop $portal1"}
    myFun("sssit.org","javatpoint.com",fn)
}

fun myFun(
    org: String,
    portal : String,
    fn: (String, String) -> String
) : Unit {
    val result = fn(org, portal)
    println(result)
}