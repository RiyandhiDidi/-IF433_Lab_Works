package oop_68383_RiyandhiAdrianDarmawan.week14

interface DiscountStrategy {

    fun applyDiscount(price: Double): Double
}

class VipDiscount : DiscountStrategy {

    override fun applyDiscount(price: Double): Double {
        return price * 0.8
    }
}

class RegularDiscount : DiscountStrategy {

    override fun applyDiscount(price: Double): Double {
        return price * 0.9
    }
}