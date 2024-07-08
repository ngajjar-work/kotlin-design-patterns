package structural.bridge

/**
 * The Bridge Pattern is a structural design pattern that promotes flexibility
 * by decoupling an abstraction from its implementation. It allows the abstraction
 * and implementation to vary independently without affecting each other.
 *
 * Advantages
 * 1. Separation of Concerns: Decouples abstraction from implementation, promoting clean code and design.
 * 2. Flexibility: Allows both the abstraction and implementation to be extended independently.
 * 3. Reduced Complexity: Simplifies complex hierarchies by separating concerns into different classes.
 * 4. Easy Maintenance: Facilitates easier modifications and maintenance by isolating changes to specific parts.
 */

abstract class RemoteControl(protected val device: Device) {
    abstract fun turnOn()
    abstract fun turnOff()
    abstract fun volumeUp()
    abstract fun volumeDown()
}

class BasicRemote(device: Device) : RemoteControl(device) {
    override fun turnOn() {
        device.turnOn()
    }

    override fun turnOff() {
        device.turnOff()
    }

    override fun volumeUp() {
        val newVolume = device.getVolume() + 10
        device.setVolume(newVolume)
    }

    override fun volumeDown() {
        val newVolume = device.getVolume() - 10
        device.setVolume(newVolume)
    }
}
