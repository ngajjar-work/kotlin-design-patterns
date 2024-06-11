package structural.bridge

interface Device {
    fun turnOn()
    fun turnOff()
    fun setVolume(volume: Int)
    fun getVolume(): Int
}

class TV : Device {
    private var volume: Int = 0

    override fun turnOn() {
        println("TV is turned on.")
    }

    override fun turnOff() {
        println("TV is turned off.")
    }

    override fun setVolume(volume: Int) {
        this.volume = volume
        println("TV volume set to $volume.")
    }

    override fun getVolume(): Int {
        return volume
    }
}

class Radio : Device {
    private var volume: Int = 0

    override fun turnOn() {
        println("Radio is turned on.")
    }

    override fun turnOff() {
        println("Radio is turned off.")
    }

    override fun setVolume(volume: Int) {
        this.volume = volume
        println("Radio volume set to $volume.")
    }

    override fun getVolume(): Int {
        return volume
    }
}
