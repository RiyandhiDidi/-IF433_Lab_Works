package oop_68383_RiyandhiAdrianDarmawan.week14

class UserValidator {

    fun validate(username: String): Boolean {
        return username.isNotBlank()
    }
}

class UserRepository {

    fun save(username: String) {
        println("Save $username ke database")
    }
}