package com.lemot.lesson_5

private const val USER_NAME = "Zaphod"
private const val PASSWORD = "PanGalactic"

fun main() {

    println(
        """
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of 
        Gold". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу 
        входа. Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. 
        [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent()
    )

    print("Введите имя пользователя: ")
    val userName = readln()

    if (userName == USER_NAME) {

        print("Введите пароль: ")
        val password = readln()

        if (password == PASSWORD) {

            println(
                """
                [вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь "Zaphod", вам разрешено 
                входить на борт корабля "Heart of Gold". Хотя мне всё равно... Ну вперед, войдите... Если вам так уж 
                надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, 
                чем мне.
            """.trimIndent()
            )
        } else {
            println("Неверный пароль! Попробуйте еще раз!")
        }

    } else {
        println("Пользователь с таким именем не найден. Пожалнйста, зарегестрируйтесь")
    }

}
