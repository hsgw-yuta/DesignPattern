package iterator

/**
 * 集合体クラス
 *
 * */
class BookShelf(maxsize : Int): Aggregate{
    private val books : Array<Book?> = arrayOfNulls(maxsize)

    companion object{
        private var last : Int = 0
    }

    val length : Int get() = last

    // Bookの管理
    fun getBookAt(index: Int): Book?{
        return books[index]
    }
    fun appendBook(book: Book){
        this.books[last] = book
        last++
    }
    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}