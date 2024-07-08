package creational.factory

import com.ngajjarwork.designpatterns.creational.factory.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CurrencyFactoryShould {

    @Test
    fun returnIndianCurrencyForCountryIndia() {
        val currency = Currency("INR")
        val uat = CurrencyFactory.getCurrency(India(3287263))
        assertEquals(currency.code, uat.code)
    }
    @Test
    fun returnAmericanCurrencyForCountryUSA() {
        val currency = Currency("USD")
        val uat = CurrencyFactory.getCurrency(USA)
        assertEquals(currency.code, uat.code)
    }
    @Test
    fun returnRussianCurrencyForCountryRussia() {
        val currency = Currency("RUB")
        val uat = CurrencyFactory.getCurrency(Russia(17098246, 147))
        assertEquals(currency.code, uat.code)
    }
}