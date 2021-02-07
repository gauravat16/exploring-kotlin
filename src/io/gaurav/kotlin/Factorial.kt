package io.gaurav.kotlin


fun factorial(i: Int): Int = if (i == 1) 1 else i * factorial(i - 1)

fun main(args: Array<String>) {
    println(factorial(5))
}