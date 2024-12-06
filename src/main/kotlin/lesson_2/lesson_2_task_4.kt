package com.lemot.lesson_2

private const val BUFF_VALUE = 0.2f

fun main() {

    val cristalOreQuantity = 7
    val ironOreQuantity = 11

    val cristalOreBonus = (cristalOreQuantity * BUFF_VALUE).toInt()
    val ironOreBonus = (ironOreQuantity * BUFF_VALUE).toInt()

    println("Бонус кристаллической руды: $cristalOreBonus")
    println("Бонус железной руды: $ironOreBonus")

}
