package com.lemot.lesson_5

private const val FIRST_WINNING_NUMBER = 7
private const val SECOND_WINNING_NUMBER = 23

fun main() {

    println("Угадай пару чисел и получи приз!")

    print("Введите первое число: ")
    val firstPlayerNumber = readln().toIntOrNull()
    print("Введите второе число: ")
    val secondPlayerNumber = readln().toIntOrNull()

    val isFirsNumberCorrect = firstPlayerNumber != null &&
            (firstPlayerNumber == FIRST_WINNING_NUMBER || firstPlayerNumber == SECOND_WINNING_NUMBER)
    val isSecondNumberCorrect = secondPlayerNumber != null &&
            (secondPlayerNumber == FIRST_WINNING_NUMBER || secondPlayerNumber == SECOND_WINNING_NUMBER)

    if (isFirsNumberCorrect && isSecondNumberCorrect) {
        println("“Поздравляем! Вы выиграли главный приз!”")
    } else if (isFirsNumberCorrect || isSecondNumberCorrect) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

}
