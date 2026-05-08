package oop_68383_RiyandhiAdrianDarmawan.week10

class NumericalStorage<T : Number>(
    private val number: T
) {

    fun toDoubleValue(): Double {
        return number.toDouble()
    }

    fun <T> compareValues(a: T, b: T): Boolean
            where T : Comparable<T> {
        return a > b
    }
}