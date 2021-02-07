package io.gaurav.kotlin


fun printFizzBuzz(num: Int) {
    for (i in 1..num) {
        when {
            i % 15 == 0 -> {
                println("fizzbuzz")
            }
            i % 3 == 0 -> {
                println("fizz")
            }
            i % 5 == 0 -> {
                println("buzz")
            }
            else -> {
                println(i)
            }
        }
    }
}

fun main(args: Array<String>) {
    printFizzBuzz(15)
}