package prototype

class PrototypeDefault: Prototype {
    override fun createClone(): PrototypeDefault {
        try {
            return clone() as PrototypeDefault
        }catch (e:CloneNotSupportedException){
            throw e
        }
    }
}