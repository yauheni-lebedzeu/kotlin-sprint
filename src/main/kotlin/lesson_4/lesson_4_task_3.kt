package com.lemot.lesson_4

private const val FAVORABLE_HUMID = 20
private const val NOT_FAVORABLE_SEASON = "Winter"

fun main() {

    val isSunnyWeather = true
    val isTentOpened = true
    val currentHumid = 20
    val currentSeason = "Winter"

    val isConditionsFavorable =
        isSunnyWeather && isTentOpened && currentHumid == FAVORABLE_HUMID && currentSeason != NOT_FAVORABLE_SEASON

    println("Благоприятные ли условия для роста бобовых? $isConditionsFavorable")

}
