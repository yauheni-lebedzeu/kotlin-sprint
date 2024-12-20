package com.lemot.lesson_4

fun main() {

    val trainingDayNumber = 5

    val isEvenTraining = trainingDayNumber % 2 == 0
    val isUnevenTraining = !isEvenTraining

    println(
        """
        Упражнения для рук:    $isUnevenTraining
        Упражнения для ног:    $isEvenTraining
        Упражнения для спины:  $isEvenTraining
        Упражнения для пресса: $isUnevenTraining
    """.trimIndent()
    )

}
