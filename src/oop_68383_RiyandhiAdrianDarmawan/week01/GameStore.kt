package oop_68383_RiyandhiAdrianDarmawan.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice
    )
}
    fun calculateDiscount(price: Int) =
        if (price > 500000) price * 20 / 100
        else price * 10 / 100

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int) {
    println("Game Title: $title")
    println("Original Price: Rp $originalPrice")
    println("Final Price: Rp $finalPrice")
}



