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

    print("Pilih jalur pendaftaran (1 = Lengkap, 2 = Tanpa Jurusan): ")
    val choice = scanner.nextInt()
    scanner.nextLine()

    val student = if (choice == 1) {
        print("Jurusan: ")
        val major = scanner.nextLine()
        Student(name, nim, major)
    } else {
        Student(name, nim)
    }

    println("Mahasiswa ${student.name} berhasil terdaftar")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) duration = 1

    val loan = loan(title, borrower, duration)

    println("Denda: Rp ${loan.calculateFine()}")

}

