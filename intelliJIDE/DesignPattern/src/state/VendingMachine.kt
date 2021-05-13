package state

class VendingMachine: Context {

    companion object{
        private val lack = LackState()
        private val sufficient = SufficientState()
    }

    private var state: State = lack
    private var money = 0

    override fun coin() {
        state.coin(v = this)
    }

    override fun push() {
        state.push(v = this)
    }

    fun warningMessage(){
        println("これ以上入金は不要です")
    }

    fun errorMessage(){
        println("必要な金額が投入されていません")
    }

    fun buy(){
        println("飲み物を取り出し口からお取りください。")
        state = lack
    }

    fun insertMoney(m:Int){
        println("お金が投入されました")
        money += m
        // 状態確認
        if(money >= 100){
            state = sufficient
        }
    }
}