fun main(args: Array<String>) {
    val book = Book.Builder("Lord Of The Rings")
            .setAuthor("J.R.R.Tolkien")
            .setPublicationYear(1954)
            .setPages(479)
            .build()

    println(book.toString())
}