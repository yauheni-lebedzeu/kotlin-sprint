package com.lemot.lesson_4

private const val MIN_CREW_NUMBER = 55
private const val MAX_CREW_NUMBER = 70
private const val MIN_PROVISION_BOXES = 50


fun main() {

    print("У коробля есть повреждения? ")
    val isShipHasDamage = readln().toBoolean()
    print("Количество членов экипажа: ")
    val crewNumber = readln().toInt()
    print("Количество ящиков с провизией: ")
    val provisionBoxesNumber = readln().toInt()
    print("Погода благороиятная? ")
    val isWeatherFavorable = readln().toBoolean()

    val isShipCanSail = (
            !isShipHasDamage &&
                    crewNumber in MIN_CREW_NUMBER..MAX_CREW_NUMBER &&
                    provisionBoxesNumber > MIN_PROVISION_BOXES
            ) || (
            isShipHasDamage &&
                    crewNumber == MAX_CREW_NUMBER &&
                    isWeatherFavorable &&
                    provisionBoxesNumber >= MIN_PROVISION_BOXES
            )

    println("Корабль может отправляться в рейс? $isShipCanSail")

}
