package oop_68383_RiyandhiAdrianDarmawan.week10

fun <T> printData(data: T) {
    println(data)

    fun <T> getData(data: T): T {
        return data
    }
}