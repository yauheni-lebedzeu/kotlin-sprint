package com.lemot.lesson_2

private const val BUFF_PERCENTAGE = 20

fun main() {

    val cristalOreQuantity = 7
    val ironOreQuantity = 11

    val cristalOreBonus = (cristalOreQuantity * (BUFF_PERCENTAGE / 100f)).toInt()
    val ironOreBonus = (ironOreQuantity * (BUFF_PERCENTAGE / 100f)).toInt()

    println("Бонус кристаллической руды: $cristalOreBonus")
    println("Бонус железной руды: $ironOreBonus")

}
