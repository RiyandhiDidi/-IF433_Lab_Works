package oop_68383_RiyandhiAdrianDarmawan.week01

fun main () {
    val name: String = "John Thor"
    val score: Int = 85

    val grade = calculatorGrade(score)

    println("Student: $name")
    println("Score: $score")
    println("Grade: $grade")
}

fun calculatorGrade(score: Int) =
    when {
        score >= 85 ->"A"
        score >= 75 -> "B"
        score >= 65 -> "C"
        else -> "D"
    }