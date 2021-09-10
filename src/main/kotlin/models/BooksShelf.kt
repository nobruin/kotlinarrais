package models

data class BooksShelf(
    val genre: String,
    val books: List<Book>,
) {
    fun organizerByAuthor(): List<Book> = books.sortedBy { it.author }

    fun organizerByPublisherDate(): List<Book> = books.sortedBy { it.publishedDate }
}