package app

fun main() {
    val list = listOf<String>("Eggy", "Andika", "Wardani")

    println(list.getOrNull(1))
    println(list.getOrElse(10){
        "Tidak ada"
    })

    println(list.subList(0, 2))

    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Eggy"))

    val number = listOf(1,1,2,2,3,3,4,4,5,5)

    println(number.indexOf(2))
    println(number.lastIndexOf(2))


}