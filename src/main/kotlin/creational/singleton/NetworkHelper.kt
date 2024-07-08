package com.ngajjarwork.designpatterns.creational.singleton

import org.junit.jupiter.api.Test

/**
 * Singleton object for managing network related operations.
 * This class ensures only one instance of NetworkHelper exists throughout the application.
 *
 * Advantage
 *
 * 1. Global Access: Provides a single, globally accessible instance of a class,
 * ensuring consistent access throughout your application.
 * 2. Controlled Instantiation: Ensures that only one instance of the class is created,
 * avoiding unnecessary resource consumption.
 * 3. Lazy Initialization: Allows the instance to be created only when it's first needed,
 * improving performance in some cases.
 * 4. State Management: The Singleton instance can hold state, allowing it to coordinate
 * actions across different parts of your application.
 *
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

class NetworkHelperTest {

    @Test
    fun testSingleton() {
        NetworkHelper.log()
        NetworkHelper.log()
    }

}