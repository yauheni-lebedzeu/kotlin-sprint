package com.lemot.lesson_5

import java.util.Calendar

private const val AGE_OF_MAJORITY = 18

fun main() {

    val calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.YEAR)

    print("Введите, пожалуйста, год своего рождения: ")
    val birthYear = readln().toIntOrNull()

    if (birthYear != null && currentYear - birthYear >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }

}
