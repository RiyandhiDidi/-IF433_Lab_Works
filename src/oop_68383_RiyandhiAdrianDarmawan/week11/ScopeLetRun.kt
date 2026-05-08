package oop_68383_RiyandhiAdrianDarmawan.week11

fun main() {

    val message: String? = "Hello Kotlin"

    message?.let {
        println("Length: ${it.length}")
    }
}