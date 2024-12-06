package com.lemot.lesson_2

private const val MINUTES_IN_HOUR = 60
private const val HOURS_IN_DAY = 24

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    var onWayMinutes = 457

    val onWayHours = onWayMinutes / MINUTES_IN_HOUR
    onWayMinutes %= MINUTES_IN_HOUR

    var arrivalHour = departureHours + onWayHours
    var arrivalMinutes = departureMinutes + onWayMinutes

    if (arrivalMinutes >= MINUTES_IN_HOUR) {
        arrivalHour += arrivalMinutes / MINUTES_IN_HOUR
        arrivalMinutes %= MINUTES_IN_HOUR
    }

    if (arrivalHour >= HOURS_IN_DAY) {
        arrivalHour %= HOURS_IN_DAY
    }

    println(String.format("Время прибытия поезда: %02d:%02d", arrivalHour, arrivalMinutes))
}