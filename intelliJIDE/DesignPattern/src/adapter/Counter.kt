package adapter

/**
 * 入退室を管理し入室人数を数えるためのインタフェース。
 *
 * */
open class Counter {
    var count: Int = 0
    fun increment(){count++}
    fun decrement(){count--}
    fun reset(){count = 0}
}