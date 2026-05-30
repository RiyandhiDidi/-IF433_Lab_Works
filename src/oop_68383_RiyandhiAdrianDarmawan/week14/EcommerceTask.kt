package oop_68383_RiyandhiAdrianDarmawan.week14

class BadOrderProcessor {

    fun processOrder(
        customerType: String,
        price: Double
    ) {

        val finalPrice = when(customerType) {

            "VIP" -> price * 0.8

            "REGULAR" -> price * 0.9

            else -> price
        }

        println("Save order: $finalPrice")

        println("Email sent")
    }
}