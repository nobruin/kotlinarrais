
fun main() {

    val purchases = listOf(
        Purchase(1, 70.0),
        Purchase(2, 2.0),
        Purchase(3, 100.0),
        Purchase(4, 50.1)
    )

    println(purchases)
    val purchaseMap = purchases.associateBy { purchase -> purchase.number }

    println(purchaseMap)
    println(purchaseMap[1])

    val purchaseFreePortage  = purchases.associateWith { purchase -> purchase.price > 50 }
    println(purchaseFreePortage)
    println(purchaseFreePortage[Purchase(number=1, price=70.0)])

    val purchaseGrouping = purchases.groupBy { purchase -> purchase.price > 50 }
    println(purchaseGrouping)
    println(purchaseGrouping[true])
    println(purchaseGrouping[false])

    val names = listOf("bruno", "jessica", "paulo", "benjamin", "Andrea", "Alan", "Paula")

    val agenda = names.groupBy { name -> name.first().toUpperCase() }
    println(agenda)
}

data class Purchase(val number: Int, val price: Double)
