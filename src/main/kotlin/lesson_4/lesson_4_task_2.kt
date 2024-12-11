package com.lemot.lesson_4

fun main() {

    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 120

    val firstLoadWeight = 20
    val firstLoadVolume = 80

    println(
        "Груз с весом $firstLoadWeight кг и объемом $firstLoadVolume л соответствует категории 'Average': " +
                "${firstLoadWeight > minWeight && firstLoadWeight <= maxWeight && firstLoadVolume < maxVolume}"
    )

    val secondLoadWeight = 50
    val secondLoadVolume = 100

    println(
        "Груз с весом $secondLoadWeight кг и объемом $secondLoadVolume л соответствует категории 'Average': " +
                "${secondLoadWeight > minWeight && secondLoadWeight <= maxWeight && secondLoadVolume < maxVolume}"
    )

}
