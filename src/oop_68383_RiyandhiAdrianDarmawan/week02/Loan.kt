package oop_68383_RiyandhiAdrianDarmawan.week02

class loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int =
        if (loanDuration > 3) (loanDuration - 3) * 2000
        else 0
}