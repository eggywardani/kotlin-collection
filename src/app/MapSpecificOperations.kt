package app

fun main() {

    val map = mapOf(
            "a" to "Eggy",
            "b" to "Andika",
            "c" to "Wardani"

    )


    println(map.get("z"))
    println(map.getValue("a"))
    println(map.getOrElse("aa"){"ups"})
    println(map.filter { entry -> entry.value.length > 5  })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5 })


}