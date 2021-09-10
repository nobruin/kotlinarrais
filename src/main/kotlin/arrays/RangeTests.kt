fun RangeTests() {
    val series = 1..10 step 3
    val range = 1.rangeTo(10)
    val reverRange = 10 downTo 0
    val reverRange2 = 10..0

    range.map { print("$it ") }

    println()

    for (s in series) {
        print("$s ")
    }

    println()
    reverRange.forEach { print("$it ") }
    reverRange2.forEach { print("$it ") }
}