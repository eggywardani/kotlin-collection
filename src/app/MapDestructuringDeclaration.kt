package app

fun main() {
    val map = mapOf(
            "a" to "Eggy",
            "b" to "Andika",
            "c" to "Wardani"

    )

    map.forEach {
        println("Key : ${it.component1()}")
        println("value : ${it.component2()}")

    }
    map.forEach { (key, value)->
        println("Key : $key")
        println("value : $value")
    }



}