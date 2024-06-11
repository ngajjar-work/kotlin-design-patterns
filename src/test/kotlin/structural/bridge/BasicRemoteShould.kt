package structural.bridge

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class BasicRemoteShould {

    private lateinit var device: Device
    private lateinit var remote: BasicRemote

    @BeforeEach
    fun setup() {
        device = mock(Device::class.java)
        remote = BasicRemote(device)
    }

    @Test
    fun increaseVolume() {
        // Given
        `when`(device.getVolume()).thenReturn(20)

        // When
        remote.volumeUp()


        // Then
        verify(device).setVolume(30)
    }

    @Test
    fun decreaseVolume() {
        // Given
        `when`(device.getVolume()).thenReturn(50)

        // When
        remote.volumeDown()

        // Then
        verify(device).setVolume(40)
    }

    @Test
    fun turnOnDevice() {
        // When
        remote.turnOn()

        // Then
        verify(device).turnOn()
    }

    @Test
    fun turnOffDevice() {
        // When
        remote.turnOff()

        // Then
        verify(device).turnOff()
    }

}