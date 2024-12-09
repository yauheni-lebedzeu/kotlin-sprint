package com.lemot.lesson_3

fun main() {

    val moveMessageString = "D2-D4;0"

    val fromPosition = moveMessageString.substring(0, 2)
    val toPosition = moveMessageString.substring(3, 5)
    val moveNumber = moveMessageString.substring(6)

    println(fromPosition)
    println(toPosition)
    println(moveNumber)

}
