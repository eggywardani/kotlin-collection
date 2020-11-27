package app

fun main() {
    val list = listOf("Eggy", "Andika","Wardani")
    val list2 = list + "Developer"
    println(list2)
    val list3 = list2 + listOf("Anda", "Adalah", "Android")
    println(list3)
    val list4 = list3 - "Eggy"
    println(list4)
    val list5 = list4 - listOf("Anda", "Adalah", "Android")
    println(list5)


    val map = mapOf("a" to "andika", "b" to "babang")
    val map2 =map + ("c" to "cyra")
    println(map2)
    val map3 = map2 - "a"
    println(map3)


}