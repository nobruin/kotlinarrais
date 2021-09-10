package models

data class Book(
    val title: String,
    val author: String,
    val publishedDate: Long,
    val publisher: String? = null,
)