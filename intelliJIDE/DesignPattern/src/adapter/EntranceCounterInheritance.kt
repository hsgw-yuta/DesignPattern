package adapter

/**
 * 継承パターン
 * */
class EntranceCounterInheritance: Counter() {
    val headcount: Int get() = super.count
    fun enter() { super.increment() }
    fun exit(){ super.decrement() }
    fun exitAll() { super.reset() }
}