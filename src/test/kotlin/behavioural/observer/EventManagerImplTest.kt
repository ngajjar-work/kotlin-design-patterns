package behavioural.observer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventManagerImplTest {

    @Test
    fun `observers should be notified of state changes`() {
        // Given
        val eventManager = EventManagerImpl()
        val observer1 = ConcreteObserver("Observer1")
        val observer2 = ConcreteObserver("Observer2")

        eventManager.addObserver(observer1)
        eventManager.addObserver(observer2)

        // When
        eventManager.state = "State 1"

        // Then
        assertThat(observer1.getObserverState()).isEqualTo("State 1")
        assertThat(observer2.getObserverState()).isEqualTo("State 1")
    }

    @Test
    fun `observer should be removed correctly`() {
        // Given
        val eventManager = EventManagerImpl()
        val observer1 = ConcreteObserver("Observer1")
        val observer2 = ConcreteObserver("Observer2")

        eventManager.addObserver(observer1)
        eventManager.addObserver(observer2)
        eventManager.removeObserver(observer2)

        // When
        eventManager.state = "State 2"

        // Then
        assertThat(observer1.getObserverState()).isEqualTo("State 2")
        assertThat(observer2.getObserverState()).isNotEqualTo("State 2")
    }

    @Test
    fun `observers should not be notified if not added`() {
        // Given
        val eventManager = EventManagerImpl()
        val observer1 = ConcreteObserver("Observer1")
        val observer2 = ConcreteObserver("Observer2")

        eventManager.addObserver(observer1)

        // When
        eventManager.state = "State 3"

        // Then
        assertThat(observer1.getObserverState()).isEqualTo("State 3")
        assertThat(observer2.getObserverState()).isNotEqualTo("State 3")
    }
}