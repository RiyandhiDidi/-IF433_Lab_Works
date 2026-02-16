package oop_68383_RiyandhiAdrianDarmawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Nama: ")
    val name = scanner.nextLine()

    print("NIM: ")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("NIM salah. Objek tidak dibuat.")
        return
    }

    print("Jurusan: ")
    val major = scanner.nextLine()

    val student = Student(name, nim, major)
    println("Mahasiswa ${student.name} berhasil dibuat")
}