package com.ngajjarwork.designpatterns.creational.factory

/**
 * The Factory Pattern is a creational design pattern
 * that provides an interface for creating objects in a superclass
 * but allows subclasses to alter the type of objects that will be created.
 * It promotes loose coupling between classes by encapsulating the object creation process.
 *
 * Advantages
 * 1. Encapsulation of Object Creation: Hides complex creation logic, promoting separation of concerns.
 * 2. Flexibility: Allows easy expansion of new object types without modifying existing code.
 * 3. Code Reusability: Reuses object creation code and can create different objects using a common interface.
 * 4. Reduces Coupling: Decouples code from the specific classes that need to be instantiated.
 */

// Sealed class to represent different countries with restrictions on subclasses
sealed class Country

// Data object representing USA (no additional properties)
data object USA : Country()

// Nested class representing India with area in square kilometers
class India(val areaSqKm: Int) : Country()

// Nested data class representing Russia with area and population information
data class Russia(val areaSqKm: Int, val populationInMillion: Long) : Country()