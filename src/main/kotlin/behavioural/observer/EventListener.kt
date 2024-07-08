package behavioural.observer

/**
 * The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects.
 * When one object (the subject) changes state, all its dependents (observers) are notified and updated automatically.
 * This pattern is useful for implementing distributed event-handling systems.
 *
 * Advantages
 * 1. Loose Coupling: Decouples the subject and observers, allowing for dynamic addition and removal of observers.
 * 2. Dynamic Update: Automatically updates all registered observers when the subject's state changes.
 * 3. Scalability: Supports a scalable system where the number of observers can change dynamically.
 * 4. Separation of Concerns: Separates the subject's core functionality from the notification and update mechanism.
 */

interface EventListener {
    fun update(state: String)
}

interface EventManager {
    fun addObserver(eventListener: EventListener)
    fun removeObserver(eventListener: EventListener)
    fun notifyObservers()
}

class ConcreteObserver(private val name: String) : EventListener {
    private var observerState: String = ""

    override fun update(state: String) {
        observerState = state
        println("Observer $name: state updated to $observerState")
    }

    fun getObserverState() = observerState
}