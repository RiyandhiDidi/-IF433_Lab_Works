package oop_68383_RiyandhiAdrianDarmawan.week14

interface Database {

    fun save()
}

class MySqlDb : Database {

    override fun save() {
        println("Save MySQL")
    }
}

class MongoDb : Database {

    override fun save() {
        println("Save MongoDB")
    }
}

class BetterUserService(
    private val database: Database
) {

    fun register() {
        database.save()
    }
}