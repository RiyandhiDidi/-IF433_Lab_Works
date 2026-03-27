package oop_68383_RiyandhiAdrianDarmawan.week07

fun main () {
    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")
    println(client.baseUrl)

    val u1 = User("Riyan", 20)
    val u2 = User("Riyan", 20)

    println(u1)
    println(u1 == u2)

    val d1 = UserData("Riyan", 20)
    val d2 = UserData("Riyan", 20)

    println(d1)
    println(d1 == d2)

    val d3 = d1.copy(age = 21)

    val (name, age) = d3
    println("$name $age")
}