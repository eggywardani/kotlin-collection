package app

fun main() {
    val map = mapOf<Int, String>(
            1 to "Eggy",
            2 to "Andika",
            3 to "Wardani"

    )

    val mapKeys = map.mapKeys { it.key *10 }
    println(mapKeys)

    val mapValues = map.mapValues { it.value.toUpperCase() }
    println(mapValues)


}