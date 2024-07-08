package behavioural.strategy

/**
 * The Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one,
 * and makes them interchangeable. The pattern allows the algorithm to vary independently from clients that use it.
 *
 * Advantages
 * 1. Flexibility: Easily swap out or add new strategies without modifying the core code.
 * 2. Testability: Each strategy can be unit tested independently from other strategies and core logic.
 * 3. Maintainability: Promotes cleaner code organization and adheres to the Open/Closed Principle (open for extension, closed for modification).
 * 4. Separation of Concerns: Separates the algorithm implementation from its usage, making the system more modular.
 */

interface PersistenceStrategy {
    fun saveData(key: String, data: String)
    fun loadData(key: String): String?
}

class SharedPrefsPersistence : PersistenceStrategy {
    // (Imagine a simple implementation using a Map to simulate SharedPreferences)
    private val dataStore = mutableMapOf<String, String>()

    override fun saveData(key: String, data: String) {
        dataStore[key] = data
        println("Data saved to SharedPreferences: $key = $data")
    }

    override fun loadData(key: String): String? {
        println("Data loaded from SharedPreferences: $key = ${dataStore[key]}")
        return dataStore[key]
    }
}

class DatabasePersistence : PersistenceStrategy {
    override fun saveData(key: String, data: String) {
        println("Data saved to Database: $key = $data")
        // ... (Actual database interaction would go here)
    }

    override fun loadData(key: String): String? {
        println("Data loaded from Database: $key = ...") // Simulate loading from DB
        return "data_from_db" // Placeholder return
    }
}