package oop_68383_RiyandhiAdrianDarmawan.week06

class Gopay : PaymentMethod {

    override fun processPayment(amount: Double) {
        println("Payment $amount processed using GoPay")
    }

}

class CreditCard : PaymentMethod {

    override fun processPayment(amount: Double) {
        println("Payment $amount processed using Credit Card")
    }

}

