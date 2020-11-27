package app


data class Fruit(val name:String, val quantity:Int)
fun main() {

    val fruit = listOf(
            Fruit("Apple", 10),
            Fruit("Orange", 4),
            Fruit("Banana", 7),
            Fruit("Grape", 11)
    )

    println(fruit.sortedBy { it.name })
    println(fruit.sortedBy { it.quantity })
    println(fruit.sortedByDescending { it.name })
    println(fruit.sortedByDescending { it.quantity })





}