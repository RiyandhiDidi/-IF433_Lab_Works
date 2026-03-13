package oop_68383_RiyandhiAdrianDarmawan.week06

class Smartphone : Camera, Phone {
    override fun takePhoto() {
        super<Camera>.takePhoto()
        super<Phone>.takePhoto()
    }
}