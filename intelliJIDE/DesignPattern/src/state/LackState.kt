package state

/**
 * 商品価格未満のコインが入金されている状態
 * */
class LackState: State {
    override fun coin(v: VendingMachine) {
         v.insertMoney(50)
    }

    override fun push(v: VendingMachine) {
         v.errorMessage()
    }
}