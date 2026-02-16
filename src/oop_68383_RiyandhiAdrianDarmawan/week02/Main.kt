package oop_68383_RiyandhiAdrianDarmawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(sourcer = System.`in`)

    println("--- APLIKASI PMB UMN ---")

    println("Masukkan nama: ")
    val name = Scanner.nextLine()

    println("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length !=5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}