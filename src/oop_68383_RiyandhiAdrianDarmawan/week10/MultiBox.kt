package oop_68383_RiyandhiAdrianDarmawan.week10

class PairBox<K, V>(
    private val key: K,
    private val value: V
) {

    fun printPair() {
        println("$key -> $value")
    }
}