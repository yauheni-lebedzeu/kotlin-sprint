package com.lemot.lesson_4

fun main() {

    val isSunnyWeather = true
    val isTentOpen = true
    val humid = 20
    val season = "Winter"

    val isConditionsFavorable = isSunnyWeather && isTentOpen && humid == 20 && season != "Winter"

    println("Благоприятные ли условия для роста бобовых? $isConditionsFavorable")

}
