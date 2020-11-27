package app

fun <T> displayMutableIterable(iterable:MutableIterable<T>){
//    for (value in iterable){
//        println(value)
//    }
//


    val iterator = iterable.iterator()
    while (iterator.hasNext() ){
        val value = iterator.next()
        // iterator.remove()
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Eggy", "Andika", "Wardani"))
    displayMutableIterable(mutableSetOf("Eggy", "Andika", "Wardani"))

}