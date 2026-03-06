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
}