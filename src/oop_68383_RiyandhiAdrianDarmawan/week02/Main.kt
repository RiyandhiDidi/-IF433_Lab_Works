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

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) duration = 1

    val loan = Loan(title, borrower, duration)

    println("Denda: Rp ${loan.calculateFine()}")

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("1. Serang | 2. Kabur")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("Hero terkena $enemyDamage, HP: ${hero.hp}")
            }
        } else {
            println("Hero kabur!")
            break
        }
    }

    if (hero.hp > enemyHp) {
        println("Hero Menang!")
    } else {
        println("Musuh Menang!")
    }
}
