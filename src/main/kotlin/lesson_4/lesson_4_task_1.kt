package com.lemot.lesson_4

private const val RESTAURANT_TABLES_NUMBER = 13

fun main() {

    val todayBookedTables = 13
    val tomorrowBookedTables = 9

    println(
        "Доступность столиков на сегодня: ${todayBookedTables < RESTAURANT_TABLES_NUMBER},\n" +
                "Доступность столиков на завтра: ${tomorrowBookedTables < RESTAURANT_TABLES_NUMBER}"
    )

}
