package oop_68383_RiyandhiAdrianDarmawan.week06

fun processCheckout(payment: PaymentMethod, amount: Double) {
    payment.processPayment(amount)
}

fun main() {

    val gopay = Gopay()
    val creditCard = CreditCard()

    processCheckout(gopay, 50000.0)
    processCheckout(creditCard, 100000.0)

} // commit
