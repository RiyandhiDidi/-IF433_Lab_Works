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
    private var performanceRating: Int = 0

    fun updatePerformance(rating: Int) {
        if (rating in 1..5) {
            performanceRating = rating
        } else {
            println("Rating harus 1 sampai 5")
        }
    }
    val yearlySalary: Int
        get() = salary * 12
}