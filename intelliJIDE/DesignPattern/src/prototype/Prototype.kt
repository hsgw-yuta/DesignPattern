package prototype

interface Prototype: Cloneable {
    fun createClone() : Prototype
}