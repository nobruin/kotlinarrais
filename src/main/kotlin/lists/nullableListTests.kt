import models.Book

fun nullableListTests() {
    val nullableList: MutableList<Book?> = getNullableList()

    nullableList.personalPrint()
}

fun getNullableList() = mutableListOf(
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
        null,
        Book(
            title = "like man and wolfs",
            author = "I dont know",
            publishedDate = 1994,
            publisher = "sea"
        ),
        Book(
            title = "the nome of rose",
            author = "I dont know",
            publishedDate = 1890,
            publisher = "I can see"
        ),
        null,
        Book(
            title = "other narnia",
            author = "Lewis",
            publishedDate = 1980,
            publisher = "star light"
        ),
    )