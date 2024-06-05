package creational.factory

import com.ngajjarwork.designpatterns.creational.factory.Country
import com.ngajjarwork.designpatterns.creational.factory.Currency
import com.ngajjarwork.designpatterns.creational.factory.CurrencyFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CurrencyFactoryTest{

    @Test
    fun currencyTestForIndia(){
        val currency = Currency("INR")
        val uat = CurrencyFactory.getCurrency(Country.India(	3287263))
        assertEquals(currency.code, uat.code)
    }
    @Test
    fun currencyTestForUSA(){
        val currency = Currency("USD")
        val uat = CurrencyFactory.getCurrency(Country.USA)
        assertEquals(currency.code, uat.code)
    }
    @Test
    fun currencyTestForRussia(){
        val currency = Currency("RUB")
        val uat = CurrencyFactory.getCurrency(Country.Russia(	17098246,147))
        assertEquals(currency.code, uat.code)
    }
}