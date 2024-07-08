package com.ngajjarwork.designpatterns.behavioural.mediator

/**
 * The Mediator Pattern is a behavioral design pattern that allows you to reduce chaotic dependencies between objects.
 * The pattern restricts direct communications between objects and forces them to collaborate only via a mediator object.
 *
 * Advantages
 * 1. Reduced Complexity: The mediator pattern reduces the dependencies between components, thereby decreasing the overall complexity of the system.
 * 2. Centralized Control: The mediator centralizes the control over how different components interact, making it easier to modify the interactions.
 * 3. Decoupling of Components: Components are decoupled from each other and only know about the mediator, making them more reusable and easier to manage.
 * 4. Improved Maintainability: Changes to the interaction logic are centralized in the mediator, which simplifies maintenance and reduces the risk of introducing errors when modifying the system.
 * 5. Facilitates Reusability: Because components communicate through the mediator and do not depend on each other, they can be reused in different contexts with different mediators.
 * 6. Promotes the Single Responsibility Principle: Each component handles its primary concern and delegates interaction responsibilities to the mediator, adhering to the Single Responsibility Principle.
 */

// Interface for the Mediator
interface ControlTowerMediator {
    fun showMessage(aircraft: Aircraft, message: String)
    fun registerAircraft(aircraft: Aircraft)
}

// Concrete Mediator
class ControlTower : ControlTowerMediator {
    private val aircraftList = mutableListOf<Aircraft>()

    override fun registerAircraft(aircraft: Aircraft) {
        aircraftList.add(aircraft)
    }

    override fun showMessage(aircraft: Aircraft, message: String) {
        val time = java.time.LocalDateTime.now()
        val sender = aircraft.name
        println("[$time] $sender: $message")

        aircraftList.filter {
            it != aircraft
        }.forEach {
            it.receive(message)
        }
    }
}