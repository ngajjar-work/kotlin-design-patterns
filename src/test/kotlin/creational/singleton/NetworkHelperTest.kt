package creational.singleton

import com.ngajjarwork.designpatterns.creational.singleton.NetworkHelper
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class NetworkHelperTest{


    @Test
    fun testSingleton(){
        val helper1 = NetworkHelper.log()
        val helper2 = NetworkHelper.log()

        assertTrue(helper1==helper2)
    }

}