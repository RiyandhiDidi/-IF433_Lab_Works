package oop_68383_RiyandhiAdrianDarmawan.week10

fun main() {

    val intBox = Box(100)
    println(intBox.getValue())

    val stringBox = Box("Hello Generic")
    println(stringBox.getValue())

    val student = PairBox("68383", "Riyandhi")
    student.printPair()
}