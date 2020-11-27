package app

import data.Person

fun main() {
    val mutableSet:MutableSet<Person> = mutableSetOf()

    mutableSet.add(Person("Eggy"))
    mutableSet.add(Person("Andika"))


    for (person in mutableSet){
        println(person)
    }

}