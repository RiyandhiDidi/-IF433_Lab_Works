package oop_68383_RiyandhiAdrianDarmawan.week13

fun fromCsvTrade(line: String): TradeRecord? {

    val parts = line.split(",")

    return TradeRecord(
        parts[0],
        parts[1],
        parts[2],
        parts[3].toDouble(),
        parts[4].toInt()
    )
}