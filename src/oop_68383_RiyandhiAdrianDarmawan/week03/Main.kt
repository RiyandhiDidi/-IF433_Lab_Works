package oop_68383_RiyandhiAdrianDarmawan.week03

fun main() {
    val e = Employee("Budi", 3000)
    e.salary = -100
    e.salary = 4000
    e.updatePerformance(5)

    println("Gaji bulanan: ${e.salary}")
    println("Gaji tahunan: ${e.yearlySalary}")
} // cleanup completed
