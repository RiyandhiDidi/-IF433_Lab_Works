package oop_68383_RiyandhiAdrianDarmawan.week13

import java.io.File

fun saveTrades(
    trades: List<TradeRecord>,
    path: String
) {

    File(path).printWriter().use { writer ->

        trades.forEach {
            writer.println(it.toCsv())
        }
    }
}