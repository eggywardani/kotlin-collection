package app

fun main() {
    val range = (1..100).toList()
    val list1 = range.chunked(10)
    println(list1)

    val list2 = range.chunked(10){
        var total = 0
        for (value in it){
            total += value
        }
        total
    }

    println(list2)
}