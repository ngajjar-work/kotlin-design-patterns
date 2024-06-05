package com.ngajjarwork.designpatterns.creational.singleton

/**
 * Singleton object for managing network related operations.
 * This class ensures only one instance of NetworkHelper exists throughout the application.
 */
object NetworkHelper {

    init {
        println("NetworkHelper initialized")
    }

    /**
     * Logs the hashcode of this instance for debugging purposes.
     * This method also demonstrates the chaining capability using the return type.
     */
    fun log(): NetworkHelper {
        println("Logging object hashcode: ${this.hashCode()}")
        return this
    }
}