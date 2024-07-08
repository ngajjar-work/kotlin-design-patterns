package behavioural.strategy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class DataManagerShould {

    private lateinit var sharedPrefsPersistence: SharedPrefsPersistence
    private lateinit var databasePersistence: DatabasePersistence

    @BeforeEach
    fun setUp() {
        sharedPrefsPersistence = SharedPrefsPersistence()
        databasePersistence = DatabasePersistence()
    }

    @Test
    fun `should save and load data using SharedPrefsPersistence`() {
        // Given
        val key = "username"
        val data = "john_doe"
        val dataManager = DataManager(sharedPrefsPersistence)

        // When
        dataManager.save(key, data)
        val loadedData = dataManager.load(key)

        // Then
        assertThat(loadedData).isEqualTo(data)
    }

    @Test
    fun `should save and load data using DatabasePersistence`() {
        // Given
        val key = "username"
        val data = "john_doe"
        val dataManager = DataManager(databasePersistence)

        // When
        dataManager.save(key, data)
        val loadedData = dataManager.load(key)

        // Then
        assertThat(loadedData).isEqualTo("data_from_db")
    }
}