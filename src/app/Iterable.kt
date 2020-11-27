package app

fun <T> displayIterable(iterable:Iterable<T>){
//    for (value in iterable){
//        println(value)
//    }
//


    val iterator = iterable.iterator()
    while (iterator.hasNext() ){
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayIterable(listOf("Eggy", "Andika", "Wardani"))
    displayIterable(setOf("Eggy", "Andika", "Wardani"))

}