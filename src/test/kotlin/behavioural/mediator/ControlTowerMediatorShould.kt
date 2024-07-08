package behavioural.mediator

import com.ngajjarwork.designpatterns.behavioural.mediator.CommercialAircraft
import com.ngajjarwork.designpatterns.behavioural.mediator.ControlTowerMediator
import com.ngajjarwork.designpatterns.behavioural.mediator.PrivateAircraft
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class ControlTowerMediatorShould {


    private lateinit var controlTower: ControlTowerMediator
    private lateinit var aircraft1: CommercialAircraft
    private lateinit var aircraft2: PrivateAircraft


    @BeforeEach
    fun setUp() {
        controlTower = mock(ControlTowerMediator::class.java)
        aircraft1 = CommercialAircraft(controlTower, "Flight 101")
        aircraft2 = PrivateAircraft(controlTower, "Jet 202")
    }


    @Test
    fun testAircraftSendMessage() {
        aircraft1.send("Requesting takeoff.")
        verify(controlTower, times(1)).showMessage(aircraft1, "Requesting takeoff.")

        aircraft2.send("Requesting landing clearance.")
        verify(controlTower, times(1)).showMessage(aircraft2, "Requesting landing clearance.")
    }

    @Test
    fun testMediatorReceivesMessages() {
        val testAircraft = CommercialAircraft(controlTower, "Test Flight")

        testAircraft.send("Test Message")
        verify(controlTower).showMessage(testAircraft, "Test Message")
    }


    @Test
    fun testAircraftSendAndReceiveMessage() {
        val message = "Requesting takeoff."

        // Send the message from aircraft1
        aircraft1.send(message)

        // Verify that aircraft2 received the message
        verify(controlTower, times(1)).showMessage(aircraft1, message)
        verify(controlTower, never()).showMessage(aircraft2, message)
    }
}