package app

fun main() {

    //ZIP
    val list1 = listOf("Eggy", "Andika", "Wardani")
    val list2 = listOf("Programmer", "Zaman", "Now", "Kudus")

    val list3 = list1.zip(list2)
    println(list3)


    val list4 = list1.zip(list2){value1, value2->
        "$value1 $value2"
    }

    println(list4)

    //UNZIP
    val list5 = listOf(
            "Eggy" to "Programmer",
            "Andika" to "Zaman",
            "Wardani" to "Now"

    )
    val pair = list5.unzip()
    println(pair.first)
    println(pair.second)

}