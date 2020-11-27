package app

fun main() {
    val list = setOf("Eggy", "Andika", "Wardani")

    println(list.elementAt(0))
    println(list.first())
    println(list.last())
    println(list.elementAtOrNull(2))
    println(list.elementAtOrNull(10))
    println(list.elementAtOrElse(2){"Tidak ada"})
    println(list.elementAtOrElse(10){"Tidak ada"})





}