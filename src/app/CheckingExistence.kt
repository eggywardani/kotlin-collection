package app

fun main() {
    val num = (1..10).toList()

    println(num.contains(8))
    println(num.containsAll(listOf(1,2,5)))
    println(num.isEmpty())
    println(num.isNotEmpty())

}