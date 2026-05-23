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

fun loadTrades(path: String): List<TradeRecord> {
    fun TradeRecord.toCsv(): String {
        return "$id,$pair,$position,$pnl,$leverage"
    }
    return File(path)
        .readLines()
        .map {
            fromCsvTrade(it)!!
        }
}