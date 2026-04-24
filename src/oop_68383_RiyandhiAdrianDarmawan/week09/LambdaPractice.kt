package oop_68383_RiyandhiAdrianDarmawan.week09

fun main() {

    val sum = { a: Int, b: Int -> a + b }
    println(sum(3, 5))

    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println(multiply(4, 2))

    val square: (Int) -> Int = { it * it }
    println(square(5))
}