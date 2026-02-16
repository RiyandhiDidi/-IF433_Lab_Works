package oop_68383_RiyandhiAdrianDarmawan.week02

class Student (
    val name: String,
    val nim: String,
    var major: String,
) {
    constructor(nim: String, name: String) : this(nim, name, "Non-Matriculated") {
        init {

            if (nim.length != 5) {
                println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
                println("Data mahasiswa @name mungkin akan bermasalah di sistem.")
            } else {

                println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
            }
        }
    }
}