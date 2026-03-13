package oop_68383_RiyandhiAdrianDarmawan.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name lamp is turned ON")
    }

    override fun turnOff() {
        println("$name lamp is turned OFF")
    }

}
