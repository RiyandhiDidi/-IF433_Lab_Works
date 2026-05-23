package oop_68383_RiyandhiAdrianDarmawan.week13

import java.io.File

fun main() {

    val file = File("sample.txt")

    file.writeText("Hello File IO")

    println(file.readText())

    file.appendText("\nBaris Kedua")
}