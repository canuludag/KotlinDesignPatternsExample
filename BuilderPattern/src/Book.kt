class Book(builder: Builder) {
    private var title: String = ""
    private var author: String = ""
    private var publicationYear: Int = 0
    private var pages: Int = 0

    init {
        this.title = builder.title
        this.author = builder.author
        this.publicationYear = builder.publicationYear
        this.pages = builder.pages
    }

    class Builder(title: String) {
        var title: String = ""
        var author: String = ""
        var publicationYear: Int = 0
        var pages: Int = 0

        init {
            this.title = title
        }

        fun setAuthor(author: String): Builder {
            this.author = author
            return this
        }

        fun setPublicationYear(year: Int): Builder {
            this.publicationYear = year
            return this
        }

        fun setPages(pages: Int): Builder {
            this.pages = pages
            return this
        }

        fun build(): Book {
            return Book(this)
        }
    }

    override fun toString(): String {
        return "${this.title}-${this.author}-${this.publicationYear}-${this.pages}"
    }

}
