package app

fun main() {
    val list = listOf("a","a","b","b","c","c")
    val grouping = list.groupingBy { it }

    println(grouping.eachCount())
    println(grouping.fold(""){first, second->
        first + second
    })
    println(grouping.reduce{key, first, second->
        first + second
    })
    
    println(grouping.aggregate { key, first:String?, second, isFirst ->
        if (isFirst) second
        else first+ second
    })


}