package com.lemot.lesson_1

fun main() {
    val secondsInSpace = 6480
    val fullMinutes = secondsInSpace / 60
    val hours = fullMinutes / 60
    val minutes = fullMinutes % 60
    val seconds = secondsInSpace % 60

    val hourString = getTimeUnitString(hours)
    val minutesString = getTimeUnitString(minutes)
    val secondsString = getTimeUnitString(seconds)

    println("$hourString:$minutesString:$secondsString")

}

private fun getTimeUnitString(timeUnitValue: Int): String {
    return if (timeUnitValue < 10) "0$timeUnitValue" else timeUnitValue.toString()
}