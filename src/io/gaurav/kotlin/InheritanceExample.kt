package io.gaurav.kotlin

import io.gaurav.kotlin.model.Rectangle
import io.gaurav.kotlin.model.Square

fun main(args: Array<String>): Unit {

    val shape1 = Square(4)
    val shape2 = Rectangle(3, 4)

    println(shape1.area())
    println(shape2.area())
}