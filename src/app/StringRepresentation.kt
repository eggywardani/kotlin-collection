package app

import java.lang.StringBuilder

fun main() {
    val names = listOf("Eggy","Andika","Wardani")
    val string1 = names.joinToString(" ","|","|")
    println(string1)

    val string2 = names.joinToString(" ","|","|"){
        it.toLowerCase()
    }

    println(string2)

    val builder = StringBuilder()
    names.joinTo(builder," ","|","|")
    names.joinTo(builder," ",">","<")
    names.joinTo(builder," ","@","@")

    val string3 = builder.toString()
    println(string3)


}