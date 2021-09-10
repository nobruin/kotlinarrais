import models.BooksShelf

fun CopyTest() {
    val database = DatabaseNames()
    database.save(name = "Bruno")
    val saveNames = database.names
    database.save("Jessica")

    println(database.names)
    println(saveNames)
}

class DatabaseNames() {
    companion object {
        private val dataNames = mutableListOf<String>()
    }

    val names: Collection<String> get() = dataNames.toList()

    fun save(name: String) {
        dataNames.add(name)
    }

}

fun CollectionTest() {
    val booksShelf = BooksShelf(
        genre = "literature",
        getList()
    )

    val organizerByAuthor = booksShelf.organizerByAuthor()
    val organizerByPublisherDate = booksShelf.organizerByPublisherDate()



    organizerByAuthor.personalPrint()
    organizerByPublisherDate.personalPrint()


    val list: Collection<Int> = mutableListOf<Int>(1, 2, 3, 4, 5)
    println(list)
}

