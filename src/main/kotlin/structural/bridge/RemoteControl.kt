package structural.bridge

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
