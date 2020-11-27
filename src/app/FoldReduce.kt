package app

fun main() {
    val num = (1..100).toList().shuffled()

    val max = num.reduce { first, second ->
        if (first > second) first
        else second
    }
    val min = num.reduce { first, second ->
        if (first < second) first
        else second
    }

    val sum = num.fold(0){first, second ->
        first + second

    }

    println(max)
    println(min)
    println(sum)


}