package oop_68383_RiyandhiAdrianDarmawan.week14

class BadOrderProcessor {

    fun processOrder(
        customerType: String,
        price: Double
    ) {

        val finalPrice = when(customerType) {

            "VIP" -> price * 0.8

            "REGULAR" -> price * 0.9

            else -> price
        }

        println("Save order: $finalPrice")

        println("Email sent")
    }
}

interface OrderRepository {

    fun saveOrder(price: Double)
}

class CsvOrderRepository : OrderRepository {

    override fun saveOrder(price: Double) {
        println("Order saved: $price")
    }
}

interface NotificationService {

    fun sendNotification()
}

class EmailNotifier : NotificationService {

    override fun sendNotification() {
        println("Email sent")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
)

interface PricingStrategy {

    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.8
    }
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.9
    }
}

class EcommerceTask(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        strategy: PricingStrategy,
        price: Double
    ) {

        val finalPrice = strategy.calculate(price)

        repo.saveOrder(finalPrice)

        notifier.sendNotification()
    }
}