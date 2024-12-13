package com.lemot.lesson_5

private const val LOWER_BOUND_OF_WINNING_NUMBERS = 0
private const val UPPER_BOUND_OF_WINNING_NUMBERS = 42

fun main() {

    val winningNumbersRange = LOWER_BOUND_OF_WINNING_NUMBERS..UPPER_BOUND_OF_WINNING_NUMBERS
    val firstWinningNumber = winningNumbersRange.random()
    val secondWinningNumber = winningNumbersRange.random()
    val thirdWinningNumber = winningNumbersRange.random()

    val winningNumbers = listOf(firstWinningNumber, secondWinningNumber, thirdWinningNumber)

    println("Угадай три числа от 0 до 42 и получи приз!")

    print("Введите первое число: ")
    val firstEnteredNumber = readln().toIntOrNull()
    print("Введите второе число: ")
    val secondEnteredNumber = readln().toIntOrNull()
    print("Введите третье число: ")
    val thirdEnteredNumber = readln().toIntOrNull()

    val enteredNumbers = listOf(firstEnteredNumber, secondEnteredNumber, thirdEnteredNumber)

    val matchedNumbers = winningNumbers.intersect(enteredNumbers.toSet())

    when (matchedNumbers.size) {
        3 -> {
            println("“Поздравляем! Вы угадали все три числа и выйграли ДЖЕКПОТ!”")
        }
        2 -> {
            println("Поздраввляем! Вы угадали два числа и выйграли крупный приз!")
        }
        1 -> {
            println("Вы угадали одно число и получаете утешительный приз")
        }
        else -> {
            println("Неудача!")
        }
    }

    println("Выйгрышные номера: $winningNumbers")

}
