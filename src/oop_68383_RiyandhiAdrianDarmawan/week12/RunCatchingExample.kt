package oop_68383_RiyandhiAdrianDarmawan.week12

fun main() {

    val result = runCatching {
        10 / 0
    }

    println(result)
}