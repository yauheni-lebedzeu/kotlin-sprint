package com.lemot.lesson_2

private const val PERCENTAGE_DIVIDER = 100f

fun main() {

    val cristalOreQuantity = 7
    val ironOreQuantity = 11
    val buffPercents = 20

    val cristalOreBonus = (cristalOreQuantity * (buffPercents / PERCENTAGE_DIVIDER)).toInt()
    val ironOreBonus = (ironOreQuantity * (buffPercents / PERCENTAGE_DIVIDER)).toInt()

    println("Бонус кристаллической руды: $cristalOreBonus")
    println("Бонус железной руды: $ironOreBonus")

}
