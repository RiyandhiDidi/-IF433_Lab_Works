package oop_68383_riyandhiadriandarmawan.week02

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

    print("Pilih jalur pendaftaran (1 = Lengkap, 2 = Tanpa Jurusan): ")
    val choice = scanner.nextInt()
    scanner.nextLine()

    val student = if (choice == 1) {
        print("Jurusan: ")
        val major = scanner.nextLine()
        student(name, nim, major)
    } else {
        student(name, nim)
    }

    println("Mahasiswa ${student.name} berhasil terdaftar")
}
