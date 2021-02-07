package io.gaurav.kotlin.model

class Rectangle(var length: Int, var breadth: Int) : Shape {

    override fun area(): Long {
        return (length * breadth).toLong()
    }
}