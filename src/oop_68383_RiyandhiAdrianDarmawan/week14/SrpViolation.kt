package oop_68383_RiyandhiAdrianDarmawan.week14

class UserManager {

    fun registerUser(username: String) {

        if (username.isBlank()) {
            println("Username tidak valid")
            return
        }

        println("Save user ke database")

        println("Kirim email ke user")
    }
}