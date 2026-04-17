package oop_68383_RiyandhiAdrianDarmawan.week08

fun main() {
    val order = Order(Customer(Address("Jakarta")))

    val city = order.customer?.address?.city ?: "Unknown City"
    println("City: $city")

    // let
    order.customer?.address?.city?.let {
        println("City with let: $it")
    }
} //