package oop_68383_RiyandhiAdrianDarmawan.week01

fun main (args : Array<String>) {
    val radius: Double = 7.0
    var pi: Double = 3.14

    var area: Double = pi * radius * radius

    println("Radius: " + radius + ", Area: " + area)

    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a big circle")
    } else {
        println("This is a smaller circle")
    }
}