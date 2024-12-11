package com.lemot.lesson_3

fun main() {

    val moveMessageString = "D2-D4;0"

    val messageElements = moveMessageString.split('-', ';')

    val fromPosition = messageElements[0]
    val toPosition = messageElements[1]
    val moveNumber = messageElements[2]

    println(fromPosition)
    println(toPosition)
    println(moveNumber)

}
