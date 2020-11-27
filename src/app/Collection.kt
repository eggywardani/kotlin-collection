package app

fun <T> displayCollection(collection:Collection<T>){
    for (element in collection){
        println(element)
    }
}


fun main() {
    displayCollection(listOf("Eggy", "Andika"))
    displayCollection(setOf("Eggy", "Andika"))
    displayCollection(mapOf("Eggy" to "Wardani").entries)
    //displayCollection(mapOf("Eggy" to "Wardani"))


}