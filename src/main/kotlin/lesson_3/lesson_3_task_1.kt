package com.lemot.lesson_3

fun main() {

    val userName = "Иван"
    val goodMorningGreeting = "Добрый день"
    val goodEveningGreeting = "Добрый вечер"

    var greetingMessage = "$goodMorningGreeting, $userName!"

    println(greetingMessage)

    greetingMessage = "$goodEveningGreeting, $userName!"

    println(greetingMessage)

}
