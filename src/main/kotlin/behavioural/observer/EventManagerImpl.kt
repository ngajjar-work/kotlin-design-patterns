package behavioural.observer

class EventManagerImpl : EventManager {
    private val eventListeners = mutableListOf<EventListener>()

    var state: String = ""
        set(value) {
            field = value
            notifyObservers()
        }

    override fun addObserver(eventListener: EventListener) {
        eventListeners.add(eventListener)
    }

    override fun removeObserver(eventListener: EventListener) {
        eventListeners.remove(eventListener)
    }

    override fun notifyObservers() {
        eventListeners.forEach { it.update(state) }
    }
}