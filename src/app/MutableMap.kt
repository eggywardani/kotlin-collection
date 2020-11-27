package app

fun main() {
    val mutableMap = mutableMapOf<String, String>()

    mutableMap.put("a", "Eggy")
    mutableMap["b"] = "Andika"
    mutableMap["c"] = "Wardani"


    println(mutableMap["a"])
    println(mutableMap.get("b"))
    println(mutableMap.getOrDefault("d", "Tidak ada"))
    println(mutableMap.get("d"))

    mutableMap.remove("b")
    for ((key, value) in mutableMap){
        println("$key to $value")
    }
}