package com.lemot.lesson_5

fun main() {

    print("Введите расстояние поездки в километрах: ")
    val tripDistance = readln().toFloatOrNull()
    print("Введите расход топлива на 100 км пути в литрах: ")
    val fuelConsumption = readln().toFloatOrNull()
    print("Введите текущую цену одного литра топлива в долларах: ")
    val pricePerFuelLiter = readln().toFloatOrNull()

    if (tripDistance != null && fuelConsumption != null && pricePerFuelLiter != null) {

        val totalFuelAmount = tripDistance * (fuelConsumption / 100)
        val totalFuelPrice = totalFuelAmount * pricePerFuelLiter

        println(
            String.format(
                "На всю поездку понадобиться %.2f литров топлива. Его итоговая стоимость составит %.2f долларов",
                totalFuelAmount,
                totalFuelPrice
            )
        )

    } else {
        println("Вы ввули неверные значения. Попробуйте еще раз")
    }

}
