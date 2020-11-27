package app

fun main() {
    val chars = ('a'..'z').toList()


    println("---------TAKE--------------")
    println(chars.take(6))
    println(chars.takeLast(7))
    println(chars.takeWhile { it < 'j' })
    println(chars.takeLastWhile { it > 'w' })

    println("---------DROP--------------")
    println(chars.drop(2))
    println(chars.dropLast(2))
    println(chars.dropWhile { it < 'm' })
    println(chars.dropLastWhile { it > 'w' })


}