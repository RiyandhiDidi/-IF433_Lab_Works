package oop_68383_RiyandhiAdrianDarmawan.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}