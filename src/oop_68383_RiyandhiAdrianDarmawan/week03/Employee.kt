package oop_68383_RiyandhiAdrianDarmawan.week03

class Employee(
    val name: String,
    salary: Int
) {
    var salary: Int = salary
        set(value) {
            if (value < 0) {
                println("Gaji tidak boleh negatif")
            } else {
                field = value
            }
        }
}