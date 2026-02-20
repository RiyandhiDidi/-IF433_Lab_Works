package oop_68383_RiyandhiAdrianDarmawan.week03

class Employee(
    val name: String,
    salary: Int
) {
    var salary: Int = salary
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}