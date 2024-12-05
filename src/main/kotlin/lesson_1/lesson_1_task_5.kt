package com.lemot.lesson_1

private const val MINUTES_IN_HOUR = 60
private const val SECONDS_IN_MINUTES = 60

fun main() {

    val secondsInSpace = 6480
    val fullMinutes = secondsInSpace / SECONDS_IN_MINUTES
    val hours = fullMinutes / MINUTES_IN_HOUR
    val minutes = fullMinutes % MINUTES_IN_HOUR
    val seconds = secondsInSpace % SECONDS_IN_MINUTES

    val hourString = getTimeUnitString(hours)
    val minutesString = getTimeUnitString(minutes)
    val secondsString = getTimeUnitString(seconds)

    val resultTimeString = String.format("%s:%s:%s", hourString, minutesString, secondsString)

    println(resultTimeString)

}

private fun getTimeUnitString(timeUnitValue: Int): String {
    return if (timeUnitValue < 10) "0$timeUnitValue" else timeUnitValue.toString()
}