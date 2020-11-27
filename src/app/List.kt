package app

fun main() {
    val list = listOf<String>("Eggy", "Andika", "Wardani")

    println(list[0])
    println(list[1])
    println(list[2])

    println(list.indexOf("Eggy"))
    println(list.indexOf("Tidak ada"))
    println(list.contains("Andika"))
    println(list.containsAll(listOf("Eggy", "Wardani")))
    println(list.isEmpty())
    println(list.isNotEmpty())








}