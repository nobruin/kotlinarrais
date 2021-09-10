import models.Book

fun listsTests() {
    val books = getList()

    books.add(Book(
        title = "By the way",
        author = "Mirella fernandez",
        publishedDate = 2010
    ))

    books.remove(Book(
        title = "the nome of rose",
        author = "I dont know",
        publishedDate = 1890,
        publisher = "I can see"
    ))

    books.personalPrint()

    books.sortedBy { it.title }
        .personalPrint()

    books.sortedBy { it.title }
        .filter { it.author == "token" }
        .personalPrint()

    books.filter { it.author.startsWith("Le") }
        .sortedBy { it.title }
        .personalPrint()

    books.filter { it.publishedDate > 1900 }
        .sortedBy { it.publishedDate }
        .personalPrint()
}

fun getList() = mutableListOf(
    Book(
        title = "narnia",
        author = "Lewis",
        publishedDate = 1980,
        publisher = "star light"
    ),
    Book(
        title = "Lord of the rings",
        author = "token",
        publishedDate = 1920,
        publisher = "kings"
    ),
    Book(
        title = "like man and wolfs",
        author = "I dont know",
        publishedDate = 1994,
        publisher = "kings"
    ),
    Book(
        title = "the nome of rose",
        author = "I dont know",
        publishedDate = 1890,
        publisher = "I can see"
    ),
    Book(
        title = "other narnia",
        author = "Lewis",
        publishedDate = 1980
    ),
    Book(
        title = "the secret",
        author = "unknow",
        publishedDate = 1980
    ),
    Book(
        title = "the secret of roses",
        author = "unknow",
        publishedDate = 1980
    ),
    Book(
        title = "Crescent moon",
        author = "unknow",
        publishedDate = 1980
    ),
)


fun List<Book?>.personalPrint() {
    val joinToString = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.title}  by  ${it.author}"
    }
    println("\n #### List of books #### \n $joinToString")
}

fun groupingBooksText() {
    getList()
        .groupBy { it.publisher ?: "unknown publisher" }
        .forEach { (publisher, books) ->
            println("$publisher: ${books.joinToString { it.title }}")
        }
}

fun mapTestWithInsertions(requests: MutableMap<Int, Double>) {
    requests[4] = 100.0
    requests.put(5, 84.0)

    println(requests)
    requests[1] = 500.0
    requests.put(2, 120.0)
    println(requests)
    requests.putIfAbsent(2, 140.0)
    println(requests)

    requests.remove(1)
    requests.remove(2, 150.0)
    println(requests)

    val request: Double? = requests[3]
    request?.let { r: Double ->
        println("Request $r")
    }

    for (entry in requests) {
        println("number of request: ${entry.key}")
        println("value of request: ${entry.value}")
    }
}


fun mappingMethodsTest(requests: MutableMap<Int, Double>) {
    //requests.getValue(5)
    println(requests.getOrElse(5, { 10.0 }))
    println(requests.getOrElse(0, { "10.0" }))
    println(requests.getOrDefault(5, -1.0))
    println(requests.getOrDefault(0, -1.0))

    println(requests.keys)
    println(requests.values)

    println(requests.filter { (index, value) ->
        index % 2 == 0 && value > 7
    })

    println(requests.filterKeys { number -> number > 2 })
    println(requests.filterValues { value -> value > 15 })

    //plus operator

    println(requests + Pair(8, 10.0))
    //  println(requests + 9  to 12.0)  not work
    println(requests + mapOf(9 to 12.0, 10 to 32.0))
    println(requests - 6)
    println(requests - listOf(1, 6))
    println(requests)

    requests.putAll(setOf(9 to 12.0, 10 to 32.0))
    println(requests)
    requests += setOf(9 to 11.0, 10 to 50.0)
    println(requests)

    requests.putAll(listOf(8 to 12.0, 11 to 32.0))
    println(requests)

    requests.values.remove(50.0)
    requests.keys.remove(4)
    requests.remove(2, 19.0)
    requests -= 5
    requests -= listOf(8, 3, 1)

    println(requests)
}