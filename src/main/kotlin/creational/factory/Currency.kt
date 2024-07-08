package com.ngajjarwork.designpatterns.creational.factory

data class Currency(val code:String)

object CurrencyFactory{

    fun getCurrency(country: Country): Currency {
       return when(country){
           is India -> Currency("INR")
           is Russia -> Currency("RUB")
           USA -> Currency("USD")
        }
    }
}
