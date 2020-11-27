package app

fun main() {
    val list = listOf(
            listOf("Eggy", "Andika", "Wardani"),
            listOf("Programmer", "Zaman", "Now")
    )

    val flat = list.flatten()
    println(flat)

    val members = listOf(
            Member("Eggy", listOf("Membaca", "Coding")),
            Member("Andika", listOf("Olahraga", "Coding"))

    )

//    val hobbies = members.map { it.hobbies }.flatten()
    val hobbies = members.flatMap { it.hobbies }
    println(hobbies)


}


class Member(val name:String, val hobbies:List<String>)