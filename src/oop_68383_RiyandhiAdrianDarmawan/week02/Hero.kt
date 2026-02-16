package oop_68383_RiyandhiAdrianDarmawan.week02

class hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack (targetName: String) {
        println("$name menyerang $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive(): Boolean = hp > 0
}