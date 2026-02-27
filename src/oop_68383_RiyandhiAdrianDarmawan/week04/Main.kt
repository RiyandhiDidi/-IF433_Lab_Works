package oop_68383_RiyandhiAdrianDarmawan.week04

fun main() {

    val vehicle = Vehicle("Toyota")
    vehicle.honk()
    vehicle.accelerate()
    vehicle.openTrunk()

    println()

    val car = Car("Honda", 4)
    car.honk()
    car.accelerate()
    car.openTrunk()
}