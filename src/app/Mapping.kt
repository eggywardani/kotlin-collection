package app

fun main() {
    val list1 = listOf<String>("Eggy", "Andika", "Wardani")

//    val temporary = mutableListOf<String>()
//
//    for (value in list1){
//        temporary.add(value.toUpperCase())
//    }
    val list2 = list1.map {
        it.toUpperCase()
    }

    println(list2)

    val names = listOf<String>("Eggy", "Andika","Fana", "Lina")
    val namesOdd = names.mapIndexedNotNull{index, name ->
        if (index %2 == 0) null
        else name
    }

    println(namesOdd)

    val numbers = (1..100).toList()
    val ganjil = numbers.mapNotNull {
        if (it % 2 == 0) null
        else it

    }

    println(ganjil)
}