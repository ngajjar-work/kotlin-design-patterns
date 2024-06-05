package com.ngajjarwork.designpatterns.creational.factory

data class Currency(val code:String)

object CurrencyFactory{

    fun getCurrency(country: Country): Currency {
       return when(country){
            is Country.India -> Currency("INR")
            is Country.Russia -> Currency("RUB")
            Country.USA -> Currency("USD")
        }
    }
}
