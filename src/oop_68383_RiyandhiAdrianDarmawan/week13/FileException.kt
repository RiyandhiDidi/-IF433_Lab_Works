package oop_68383_RiyandhiAdrianDarmawan.week13

import java.io.File
import java.io.FileNotFoundException

fun main() {

    try {

        val text = File("missing.txt").readText()
        println(text)

    } catch (e: FileNotFoundException) {

        println("File tidak ditemukan")
    }
}