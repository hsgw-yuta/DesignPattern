package factoryMethod

import java.lang.Exception

abstract class Application {
    abstract fun createDocument(): Document
    companion object {
        fun from(documentType: DocumentType): Application{
            return when(documentType){
                DocumentType.Drawing -> DrawingApplication()
                DocumentType.Word -> WordApplication()
                else -> throw Exception("Invalid document type") // 無効なドキュメントタイプ
            }
        }
    }

}