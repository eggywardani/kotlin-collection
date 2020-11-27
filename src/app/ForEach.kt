package app

fun main() {
//    for(value in listOf("Eggy", "Andika", "Wardani") ){
//        println(value)
//    }
//
//

    listOf("Eggy", "Andika", "Wardani").forEach {
        println(it)
    }

    listOf("Eggy", "Andika", "Wardani").forEachIndexed { index, s ->
        println("$index = $s")
    }





}