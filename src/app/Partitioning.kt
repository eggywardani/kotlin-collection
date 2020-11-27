package app

fun main() {
    val list = listOf("Eggy", "Andika","Wardani")

    val pair = list.partition {
        it.length > 5
    }

    println(pair.first)
    println(pair.second)

}