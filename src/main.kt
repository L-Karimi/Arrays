fun main(){

     Strgs()
     town()
    array()
    names()
}
fun Strgs() {
    var people = arrayOf("Joel","Annita","Preston","Hannah")
    println(people.contentToString())
}
fun town(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { twn->
        println(twn.capitalize())
    }
}
fun array(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers.get(1) + numbers.get(4)
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun names(){
 var list = listOf<String>("Jane","Ann","Preston","Stellah")
    println(list.toString())

}
