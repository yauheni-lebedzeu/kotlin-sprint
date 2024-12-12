package com.lemot.lesson_5

private const val LOWER_BOUND_OF_SUMMANDS = 1
private const val UPPER_BOUND_OF_SUMMANDS = 10

fun main() {

    val intRange = LOWER_BOUND_OF_SUMMANDS..UPPER_BOUND_OF_SUMMANDS

    val firsRandomInteger = intRange.random()
    val secondRandomInteger = intRange.random()

    print("Введите сумму двух чисел '$firsRandomInteger' и '$secondRandomInteger', чтобы понять не бот ли вы: ")

    val sum = readln().toIntOrNull()

    if (sum != null && sum == firsRandomInteger + secondRandomInteger) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }

}
