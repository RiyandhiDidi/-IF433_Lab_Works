package oop_68383_RiyandhiAdrianDarmawan.week13

import java.io.File

fun main() {

    val trades = listOf(

        TradeRecord(
            "TRX001",
            "BTCUSDT",
            "LONG",
            150.0,
            20
        ),

        TradeRecord(
            "TRX002",
            "ETHUSDT",
            "SHORT",
            -50.0,
            10
        ),

        TradeRecord(
            "TRX003",
            "SOLUSDT",
            "LONG",
            80.0,
            15
        )
    )

    saveTrades(
        trades,
        "crypto_trades.csv"
    )

    File("crypto_trades.csv")
        .appendText(
            "CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n"
        )
}