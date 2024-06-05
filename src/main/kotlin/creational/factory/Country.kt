package com.ngajjarwork.designpatterns.creational.factory

// Sealed class to represent different countries with restrictions on subclasses
sealed class Country {

    // Nested class representing India with area in square kilometers
    class India(val areaSqKm: Int) : Country()

    // Data object representing USA (no additional properties)
    data object USA : Country()

    // Nested data class representing Russia with area and population information
    data class Russia(val areaSqKm: Int, val populationInMillion: Long) : Country()
}