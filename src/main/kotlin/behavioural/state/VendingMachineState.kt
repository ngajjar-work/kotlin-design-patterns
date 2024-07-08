package behavioural.state


/**
 * The VendingMachineState sealed interface defines the common interface for
 * all concrete states in the Vending Machine. This approach uses the
 * State Pattern to encapsulate state-specific behaviors and transitions.
 *
 * Advantages of using the State Pattern:
 * - Simplifies Complex State Logic
 * - Enhances Maintainability
 * - Encapsulates State-Dependent Behavior
 * - Improves Code Flexibility
 * - Supports Open/Closed Principle
 * - Promotes Single Responsibility Principle
 * - Facilitates Testing
 */
sealed interface VendingMachineState {

    fun insertMoney(machine: VendingMachine)
    fun dispenseProduct(machine: VendingMachine)

    data object IdleState : VendingMachineState {
        override fun insertMoney(machine: VendingMachine) {
            println("Money inserted.")
            machine.state = HasMoneyState
        }

        override fun dispenseProduct(machine: VendingMachine) {
            println("Insert money first.")
        }
    }

    data object HasMoneyState : VendingMachineState {
        override fun insertMoney(machine: VendingMachine) {
            println("Money already inserted.")
        }

        override fun dispenseProduct(machine: VendingMachine) {
            println("Dispensing product.")
            machine.state = IdleState
        }
    }
}
