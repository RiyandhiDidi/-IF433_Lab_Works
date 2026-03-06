package oop_68383_RiyandhiAdrianDarmawan.week05

class Dosen(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang mengajar di kelas")
    }

    fun mengajar() {
        println("$nama memberikan materi kepada mahasiswa")
    }
}