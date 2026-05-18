package oop_68383_RiyandhiAdrianDarmawan.week12

fun main() {

    val result = runCatching {
        10 / 0
    }

    println(result)

    val safeResult = runCatching {
        10 / 0
    }
        .getOrElse {
            -1
        }

    println(safeResult)

    val recovered = runCatching {
        10 / 0
    }
        .recover {
            100
        }

    println(recovered.getOrNull())
}

