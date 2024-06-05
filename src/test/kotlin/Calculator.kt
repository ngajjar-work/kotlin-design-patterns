import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Calculator {

    fun sum(a:Int, b:Int):Int{
        return a+b
    }
}

class CalculatorTest{

    private var uat = Calculator()

    @Test
    fun `sum should return 0 for 0 and 0`(){
        Assertions.assertEquals(0,uat.sum(0,0))
    }
}