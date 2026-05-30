package oop_68383_RiyandhiAdrianDarmawan.week14

class MySQLDatabase {

    fun save() {
        println("Save MySQL")
    }
}

class UserService {

    private val db = MySQLDatabase()

    fun register() {
        db.save()
    }
}