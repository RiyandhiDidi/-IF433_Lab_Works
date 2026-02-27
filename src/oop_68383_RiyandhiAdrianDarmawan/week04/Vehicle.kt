package oop_68383_RiyandhiAdrianDarmawan.week04

open class Vehicle(
    val brand: String
) {

    open fun honk() {
        println("$brand berbunyi: Beep beep!")
    }

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }

    fun openTrunk() {
        println("Bagasi $brand terbuka.")
    }
}