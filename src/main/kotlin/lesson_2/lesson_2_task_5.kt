package com.lemot.lesson_2

import kotlin.math.pow

fun main() {

    val initialDeposit = 70_000
    val interestRate = 16.7
    val depositYearsPeriod = 20

    val finalDeposit = initialDeposit * (1 + interestRate / 100).pow(depositYearsPeriod)

    val roundedFinalDeposit = String.format("%.3f", finalDeposit)

    println(roundedFinalDeposit)

}
