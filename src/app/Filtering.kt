package app

fun main() {
    val list = listOf("Eggy","Andika","Wardani")
    val list2 = list.filter { it.length > 5  }
    val list3 = list.filterIndexed { index, s ->
        index % 2== 0
    }

    println(list)
    println(list2)
    println(list3)


    val list4 = listOf(null, "Eggy", "Wardani",1,3,null)
    val list5 = list4.filterIsInstance<String>()
    val list6 = list4.filterIsInstance<Int>()

    println(list4)
    println(list5)
    println(list6)




}