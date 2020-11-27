package app

fun <T> displayMutbleCollection(collection:MutableCollection<T>){
    for (element in collection){
        println(element)
    }
}


fun main() {
    //displayMutbleCollection(listOf("Eggy", "Andika"))
    displayMutbleCollection(mutableListOf("Eggy", "Andika"))
    //displayMutbleCollection(setOf("Eggy", "Andika"))
    displayMutbleCollection(mutableSetOf("Eggy", "Andika"))
    //displayMutbleCollection(mapOf("Eggy" to "Wardani").entries)
    displayMutbleCollection(mutableSetOf("Eggy" to "Wardani"))

}