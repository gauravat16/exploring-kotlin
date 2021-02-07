package io.gaurav.kotlin.model

open class Square(var side: Int) : Shape {

    override fun area(): Long {
        return (side * side).toLong()
    }
}