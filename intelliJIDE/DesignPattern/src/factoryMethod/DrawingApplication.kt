package factoryMethod

class DrawingApplication: Application() {
    override fun createDocument(): Document = DrawingDocument()
}