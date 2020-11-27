package app

fun main() {
    val mutableList = mutableListOf<String>()

    mutableList.add("Eggy")
    mutableList.add("Andika")
    mutableList.add("Wardani")
//    mutableList.set(0, "Fina")
//    mutableList.remove("Wardani")
    println(mutableList[0])
    println(mutableList[1])
    println(mutableList[2])

    for (value in mutableList){
        println(value)
    }


}