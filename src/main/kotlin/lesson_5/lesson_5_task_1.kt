package com.lemot.lesson_5

import kotlin.random.Random

private const val UPPER_BOUND_OF_SUMMANDS = 100

fun main() {

    val firsRandomInteger = Random.nextInt(UPPER_BOUND_OF_SUMMANDS)
    val secondRandomInteger = Random.nextInt(UPPER_BOUND_OF_SUMMANDS)

    print("Введите сумму двух чисел '$firsRandomInteger' и '$secondRandomInteger', чтобы понять не бот ли вы: ")

    val sum = readln().toIntOrNull()

    if (sum != null && sum == firsRandomInteger + secondRandomInteger) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }

}
