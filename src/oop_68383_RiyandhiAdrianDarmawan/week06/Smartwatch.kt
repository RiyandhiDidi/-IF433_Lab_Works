package oop_68383_RiyandhiAdrianDarmawan.week06

class Smartwatch(brand: String) :
    Watch(brand),
    WifiEnabled,
    BluetoothEnabled {

    override fun showTime() {
        println("$brand smartwatch shows time")
    }

    override fun connectWifi() {
        println("$brand connected to WiFi")
    }

    override fun connectBluetooth() {
        println("$brand connected to Bluetooth")
    }

}
