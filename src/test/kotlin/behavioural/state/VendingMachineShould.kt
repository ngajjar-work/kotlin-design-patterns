package behavioural.state

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class VendingMachineShould {

    private lateinit var vendingMachine: VendingMachine

    @BeforeEach
    fun setup() {
        vendingMachine = VendingMachine()
    }

    @Test
    fun start_in_idle_state() {
        assertTrue(vendingMachine.state is VendingMachineState.IdleState)
    }

    @Test
    fun transition_to_has_money_state_when_money_inserted() {
        vendingMachine.insertMoney()
        assertTrue(vendingMachine.state is VendingMachineState.HasMoneyState)
    }

    @Test
    fun stay_in_idle_state_when_money_inserted_in_idle_state() {
        vendingMachine.insertMoney() // Transition to HasMoneyState
        vendingMachine.insertMoney() // Call again in HasMoneyState
        assertTrue(vendingMachine.state is VendingMachineState.HasMoneyState)
    }

    @Test
    fun transition_back_to_idle_state_after_dispensing_product() {
        vendingMachine.insertMoney() // Transition to HasMoneyState
        vendingMachine.dispenseProduct()
        assertTrue(vendingMachine.state is VendingMachineState.IdleState)
    }

    @Test
    fun dispense_product_when_in_has_money_state() {
        vendingMachine.insertMoney() // Transition to HasMoneyState
        vendingMachine.dispenseProduct()
        assertTrue(vendingMachine.state is VendingMachineState.IdleState)
    }

    @Test
    fun show_message_when_in_idle_state_and_dispensing_product() {
        vendingMachine.dispenseProduct()
    }


}