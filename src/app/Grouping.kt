package app

fun main() {
    val list = listOf("a","b","c","b","e","c","aa","ab","adad")
    val map = list.groupBy { it->it }
    println(map)

    val map2 = list.groupBy { it -> it.length }
    println(map2)
}