package factoryMethod

class WordApplication: Application() {
    override fun createDocument(): Document = WordDocument()
}