package com.lemot.lesson_5

fun main() {

    print("Введите свой вес в килограммах: ")
    val weight = readln().toFloatOrNull()
    print("Введите свой рост в санциметрах: ")
    val height = readln().toFloatOrNull()

    if (height != null && weight != null) {

        val heightInMetres = height / 100
        val bodyMassIndex = weight / (heightInMetres * heightInMetres)

        val weightCategory = when {
            bodyMassIndex < 18.5 -> {
                "недостаточная масса тела"
            }

            bodyMassIndex >= 18.5 && bodyMassIndex < 25 -> {
                "нормальная масса тела"
            }

            bodyMassIndex >= 25 && bodyMassIndex < 30 -> {
                "избыточная масса тела"
            }

            else -> {
                "ожирение"
            }
        }

        println(String.format("Ваш ИМТ - %.2f. У вас %s.", bodyMassIndex, weightCategory))

    } else {
        println("Вы ввели неверные значения! Попробуйте еще раз!")
    }

}
