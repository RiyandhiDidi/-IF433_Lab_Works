package oop_68383_RiyandhiAdrianDarmawan.week11

class User {
    var name: String = ""
    var age: Int = 0

    fun main() {

        val user = User().apply {
            name = "Riyandhi"
            age = 20
        }

        println(user.name)
        user.also {
            println("Debug User: ${it.name}")
        }
    }
}