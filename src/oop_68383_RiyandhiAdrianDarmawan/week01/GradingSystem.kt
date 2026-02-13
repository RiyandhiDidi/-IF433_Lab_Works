package oop_68383_RiyandhiAdrianDarmawan.week01

fun main () {
    val name: String = "John Thor"
    val score: Int = 80

    val grade = when {
        score >= 85 ->"A"
        score >= 75 -> "B"
        score >= 65 -> "C"
        else -> "D"
    }

    println("Student: $name")
    println("Score: $score")
    println("Grade: $grade")
}