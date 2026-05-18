package oop_68383_RiyandhiAdrianDarmawan.week12

class InsufficientFundsException(message: String) : Exception(message)

class BankAccount(
    private var balance: Int
) {

    fun withdraw(amount: Int) {

        if (amount > balance) {
            throw InsufficientFundsException(
                "Saldo tidak cukup!"
            )
        }

        balance -= amount
        println("Withdraw berhasil")
    }
}