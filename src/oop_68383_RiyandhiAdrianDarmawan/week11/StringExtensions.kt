package oop_68383_RiyandhiAdrianDarmawan.week11

fun String.greet(): String {
    return "Hello, $this"
}

fun String?.safeLength(): Int {
    return this?.length ?: 0
}