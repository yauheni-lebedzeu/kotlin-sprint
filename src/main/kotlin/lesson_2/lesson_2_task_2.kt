package com.lemot.lesson_2

fun main() {

    val employeesNumber = 50
    val employeeSalary = 30000
    val internsNumber = 30
    val internSalary = 20000

    val employeeSalaryExpense = employeesNumber * employeeSalary
    val totalSalaryExpense = employeeSalaryExpense + internsNumber * internSalary
    val avgSalary = totalSalaryExpense / employeesNumber + internsNumber

    println(employeeSalaryExpense)
    println(totalSalaryExpense)
    println(avgSalary)

}
