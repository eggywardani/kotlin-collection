package app

fun main() {
    val map = mapOf<String,String>(
        "a" to "Eggy",
        "b" to "Andika",
        "c" to "Wardani"
    )

    println(map.keys)
    println(map.values)

    for ((key, value) in map){
        println("$key to $value")
    }
}