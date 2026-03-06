package oop_68383_RiyandhiAdrianDarmawan.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang mengurus administrasi kampus")
    }
}