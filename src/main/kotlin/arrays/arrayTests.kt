fun arraysTests() {
    val ages = intArrayOf(10, 2, 3, 4, 5, 52, 53, 17)
    println(ages.max())
    println(ages.min())
    println(ages.average())

    println(ages.all { it >= 18 })
    print(ages.any { it >= 18 })

    println(ages.filter { it >= 18 })
    println(ages.find { it >= 18 })
}
