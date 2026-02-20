package oop_68383_RiyandhiAdrianDarmawan.week03

fun main() {
    val e = Employee("Budi", 3000)
    e.salary = -100
    e.salary = 4000
    e.updatePerformance(5)

    println("Gaji bulanan: ${e.salary}")
    println("Gaji tahunan: ${e.yearlySalary}")

    val weapon = Weapon("Pedang", 100)
    weapon.damage = -50
    weapon.damage = 9999
    println("Tier senjata: ${weapon.tier}")
} // cleanup completed
