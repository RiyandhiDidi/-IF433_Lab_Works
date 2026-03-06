package oop_68383_RiyandhiAdrianDarmawan.week05

fun main() {

    val dosen = Dosen("Pak Budi")
    val admin = Admin("Bu Sari")

    val daftarPegawai = listOf<Pegawai>(dosen, admin)

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {

            is Dosen -> pegawai.mengajar()

            is Admin -> println("${pegawai.nama} bekerja di kantor administrasi")

        }
        println()
    }

    println("===== TEST MATH HELPER =====")

    val math = MathHelper()

    println("Luas persegi: ${math. hitungLuas(5)}")
    println("Luas persegi panjang: ${math.hitungLuas(5,4)}")
    println("Luas lingkaran: ${math.hitungLuas(7.0)}")

    println()

    println("===== PAYMENT SYSTEM =====")

    val wallet = EWallet("Riyandhi", 50000.0)
    val card = CreditCard("Riyandhi", 100000.0)

    val payments = listOf<PaymentMethod>(wallet, card)

    for (method in payments) {

        method.processPayment(75000.0)

        if (method is EWallet) {
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }

        // week05: final smart casting implementation

    }
}