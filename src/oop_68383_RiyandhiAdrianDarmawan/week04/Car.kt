package oop_68383_RiyandhiAdrianDarmawan.week04

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun honk() {
        println("$brand berbunyi: Toot toot!")
    }
    override fun accelerate() {
        super.accelerate()
        println("$brand melaju lebih cepat dengan $numberOfDoors pintu.")
    }
}
