package oop_68383_RiyandhiAdrianDarmawan.week12

fun main() {

    try {
        val result = 10 / 0
        println(result)
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
    } finally {
        println("Program selesai")
    }

    val result = try {
        100 / 2
    } catch (e: Exception) {
        0
    }

    println(result)
}