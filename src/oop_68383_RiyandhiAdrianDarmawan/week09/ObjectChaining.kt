package oop_68383_RiyandhiAdrianDarmawan.week09

data class Student(val name: String, val score: Int)

fun main() {

    val students = listOf(
        Student("A", 80),
        Student("B", 60),
        Student("C", 90),
        Student("D", 50)
    )
}