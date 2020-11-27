package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Eggy"), Person("Andika"),Person("Eggy"), Person("Wardani")
    )

    println(set.size)
    println(set.contains(Person("Eggy")))


    for (person in set){
        println(person)
    }
}