package oop_68383_RiyandhiAdrianDarmawan.week07

fun main () {
    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)
}