package app

fun main() {
    val list = (0..100).toList()
    val list2 = list.slice(0..50)
    val list3 = list.slice(0..100 step 2)
    val list4 = list.slice(100 downTo 0 step 4)

    println(list)
    println(list2)
    println(list3)
    println(list4)

}