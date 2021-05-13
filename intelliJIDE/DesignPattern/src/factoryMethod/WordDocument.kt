package factoryMethod

import javax.print.Doc

class WordDocument: Document {
    override fun showDocumentInfo() {
        println("This is a word document")
    }
}