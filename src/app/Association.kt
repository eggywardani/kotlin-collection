package app

fun main() {
    val list1 = listOf("Eggy", "Andika", "Wardani")
    val map1 = list1.associate { Pair(it,it.length) }
    println(map1)

    val map2 = list1.associateWith { it.length }
    val map3 = list1.associateBy { it.length }

    println(map2)
    println(map3)
}