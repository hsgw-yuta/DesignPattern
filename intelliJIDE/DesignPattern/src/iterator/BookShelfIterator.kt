package iterator

class BookShelfIterator(bookShelf : BookShelf) : Iterator{

    private val mBookshelf: BookShelf = bookShelf
    private var index: Int = 0

    override fun hasNext(): Boolean = (index < mBookshelf.length)

    override fun next(): Any {
        val book = mBookshelf.getBookAt(index)
        index++
        return book as Any
    }
}