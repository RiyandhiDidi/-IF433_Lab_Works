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

fun main() {

    val account = BankAccount(100)

    try {
        account.withdraw(200)

    } catch (e: InsufficientFundsException) {
        println(e.message)

    } catch (e: ArithmeticException) {
        println(e.message)

    } catch (e: Exception) {
        println("Unknown error")
    }
}