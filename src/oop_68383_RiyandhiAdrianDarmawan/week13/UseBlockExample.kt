package oop_68383_RiyandhiAdrianDarmawan.week13

import java.io.File

fun main() {

    File("safe.txt").printWriter().use { writer ->
        writer.println("Safe Write")
    }
}