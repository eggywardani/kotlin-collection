package app

fun main() {
    val number = (1..100).toList()

    println(number.max())
    println(number.min())
    println(number.average())
    println(number.sum())

    println(number.sumBy { it/2 })


}