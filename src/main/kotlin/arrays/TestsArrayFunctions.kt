import java.math.BigDecimal
import java.math.RoundingMode

fun testsArrayFunctions() {
    val payments = bigDecimalArrayOf("10000.12", "2000.00", "1000.01", "5000.00", "3000.01")
    println(payments.contentToString())

    val paymentsWithIncrease = payments.map { payment ->
        calculateRelativeIncrease(payment)
    }
    println(paymentsWithIncrease)
    val firstPaymentForMonth = paymentsWithIncrease.sum()
    println(firstPaymentForMonth)
    val paymentsForSixMonth = paymentsWithIncrease.fold(firstPaymentForMonth) { acc, payment ->
        acc + (payment * "6".toBigDecimal()).setScale(2, RoundingMode.UP)
    }
    println(paymentsForSixMonth)
    println(paymentsWithIncrease
        .sorted()
        .takeLast(3)
        .average()
    )

    println(paymentsWithIncrease
        .sorted()
        .take(3)
        .average()
    )
}

private fun calculateRelativeIncrease(
    payment: BigDecimal,
    increase: BigDecimal = "1.1".toBigDecimal(),
) = if (payment < "5000".toBigDecimal()) {
    payment + "500".toBigDecimal()
} else {
    (payment * increase).setScale(2, RoundingMode.UP)
}

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array(values.size) { i ->
        values[i].toBigDecimal()
    }
}

fun List<BigDecimal>.sum(): BigDecimal {
    return this.reduce { acc, bigDecimal ->
        bigDecimal + acc
    }
}

fun List<BigDecimal>.average(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.sum() / this.size.toBigDecimal()
    }
}