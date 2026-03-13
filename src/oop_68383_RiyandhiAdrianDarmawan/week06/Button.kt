package oop_68383_RiyandhiAdrianDarmawan.week06

class Button(override val name: String) : Clickable {

    override fun click() {
        println("$name clicked!")
    }

}