package oop_68383_RiyandhiAdrianDarmawan.week11

fun main() {

    val name = "Riyandhi"
    println(name.greet())

    val emptyText: String? = null
    println(emptyText.safeLength())

    val result = run {
        val a = 10
        val b = 20
        a + b
    }

    println(result)
}