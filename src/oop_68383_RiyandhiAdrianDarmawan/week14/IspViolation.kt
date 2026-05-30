package oop_68383_RiyandhiAdrianDarmawan.week14

interface MultifunctionDevice {

    fun print()

    fun scan()

    fun fax()
}

class SimplePrinter : MultifunctionDevice {

    override fun print() {
        println("Print")
    }

    override fun scan() {}

    override fun fax() {}
}