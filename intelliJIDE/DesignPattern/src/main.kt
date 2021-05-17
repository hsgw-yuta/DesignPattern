package iterator

import prototype.PrototypeData

fun main(){

    /**Factory Method Patter **/
/**
val drawingApplication = Application.from(DocumentType.Drawing)
val drawingDocument = drawingApplication.createDocument()
drawingDocument.showDocumentInfo()

val wordApplication = Application.from(DocumentType.Word)
val wordDocument = wordApplication.createDocument()
wordDocument.showDocumentInfo()
 */

    /** adapter pattern **/
/**
val west : Entrance = EntranceCounterDevolution()
west.enter()
println("西 ${west.headcount}人 入室中")
west.exit()
println("西 ${west.headcount}人 入室中")
west.enter()
println("西 ${west.headcount}人 入室中")
west.enter()
println("西 ${west.headcount}人 入室中")
west.exitAll()
println("西 ${west.headcount}人 入室中")
 */

    /** state pattern **/
/**
    val v: Context = VendingMachine()
    v.coin()
    v.push()
    v.coin()
    v.coin()
    v.push()
 */

    /** prototype pattern **/
/**
val p = ProductDefault()
val c = p.createClone()

println("-- Class Clone Test --")
println("pとpは${if (p === p) "同じ" else "別の"}インスタンス")
println("pとcは${if (p === c) "同じ" else "別の"}インスタンス")
 */

    /** dataClassの活用 **/

    val data = PrototypeData("iPhone", "0000-1111-2222-3333")
    val copyData = data.copy()
    println("-- Data Class Clone Test --")
    println("dataとdataは${if (data === data) "同じ" else "別の"}インスタンス")
    println("dataとcopyDataは${if (data === copyData) "同じ" else "別の"}インスタンス")
    println("data = $data")
    println("copyData = $copyData")
}