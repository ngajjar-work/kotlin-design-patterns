package behavioural.state


/**
 * Represents the Vending Machine which maintains the current state
 * and delegates actions to the state instance.
 */
class VendingMachine(var state: VendingMachineState = VendingMachineState.IdleState) {

    fun insertMoney() {
        state.insertMoney(this)
    }

    fun dispenseProduct() {
        state.dispenseProduct(this)
    }
}