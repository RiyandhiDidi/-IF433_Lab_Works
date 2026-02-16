package oop_68383_RiyandhiAdrianDarmawan.week02

class Student(
    val name: String,
    val nim: String,
    var major: String
) {
    init {
        if (nim.length != 5) {
            println("WARNING: NIM tidak valid")
        }
    }

    constructor(name: String, nim: String) : this(
        name,
        nim,
        "Non-Matriculated"
    )
}