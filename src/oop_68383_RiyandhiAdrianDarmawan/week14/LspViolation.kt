package oop_68383_RiyandhiAdrianDarmawan.week14

open class Rectangle {

    open var width = 0
    open var height = 0
}

class Square : Rectangle() {

    override var width: Int
        get() = super.width
        set(value) {
            super.width = value
            super.height = value
        }

    override var height: Int
        get() = super.height
        set(value) {
            super.width = value
            super.height = value
        }
}