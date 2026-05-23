package oop_68383_RiyandhiAdrianDarmawan.week13

data class TradeRecord(
    val id: String,
    val pair: String,
    val position: String,
    val pnl: Double,
    val leverage: Int
)