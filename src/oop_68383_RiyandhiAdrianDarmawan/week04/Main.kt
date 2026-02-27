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

    println()

    val tesla = ElectricCar("Tesla", 4, 90)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    println()

    val manager = Manager("Andi", 10000000)
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println()

    val developer = Developer("Riyan", 8000000, "kotlin")
    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}