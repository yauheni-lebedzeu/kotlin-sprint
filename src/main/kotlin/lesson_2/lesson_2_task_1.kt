package com.lemot.lesson_2

fun main() {

    val firstStudentScore = 3
    val secondStudentScore = 4
    val thirdStudentScore = 3
    val forthStudentScore = 5

    val countOfStudents = 4

    val avgScore =
        firstStudentScore + secondStudentScore + thirdStudentScore + forthStudentScore / countOfStudents.toFloat()

    val roundedAvgScore = String.format("%.2f", avgScore)

    println(roundedAvgScore)

}
