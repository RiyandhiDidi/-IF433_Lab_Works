package oop_68383_RiyandhiAdrianDarmawan.week08

fun main() {
    val order = Order(Customer(Address("Jakarta")))

    val city = order.customer?.address?.city ?: "Unknown City"
    println("City: $city")

    // let
    order.customer?.address?.city?.let {
        println("City with let: $it")
    }
    val items: List<Any> = listOf("Hello", 123, "World", true)

    for (item in items) {
        val str = item as? String
        if (str != null) {
            println("String: $str")
        }
    }

    for (item in items) {
        val value = item as? String ?: "Not a String"
        println(value)
    }

    val text: String? = null
    println(text!!)

    val safeText = requireNotNull(text) { "Text cannot be null" }
    println(safeText)

    val result = LegacyJavaAPI.getData()!!
    println(result)
}