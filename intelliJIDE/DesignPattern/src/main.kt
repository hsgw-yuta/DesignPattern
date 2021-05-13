package iterator

import adapter.Entrance
import adapter.EntranceCounterDevolution
import factoryMethod.Application
import factoryMethod.DocumentType
import state.Context
import state.VendingMachine
import java.awt.Shape

fun main(){

    /**
     * Factory Method Pattern
     * */
//    val drawingApplication = Application.from(DocumentType.Drawing)
//    val drawingDocument = drawingApplication.createDocument()
//    drawingDocument.showDocumentInfo()
//
//    val wordApplication = Application.from(DocumentType.Word)
//    val wordDocument = wordApplication.createDocument()
//    wordDocument.showDocumentInfo()

    /** adapter pattern **/
//    val west : Entrance = EntranceCounterDevolution()
//    west.enter()
//    println("西 ${west.headcount}人 入室中")
//    west.exit()
//    println("西 ${west.headcount}人 入室中")
//    west.enter()
//    println("西 ${west.headcount}人 入室中")
//    west.enter()
//    println("西 ${west.headcount}人 入室中")
//    west.exitAll()
//    println("西 ${west.headcount}人 入室中")

    /** state pattern **/
//    val v: Context = VendingMachine()
//    v.coin()
//    v.push()
//    v.coin()
//    v.coin()
//    v.push()
}