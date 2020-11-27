package app

fun main() {
    val list = mutableListOf("Eggy", "Andika", "Wardani")
    val listReverse = list.reversed()
    val listAsReverse = list.asReversed()

    list.add("Kudus")
    println(list)
    println(listReverse)
    println(listAsReverse)


}