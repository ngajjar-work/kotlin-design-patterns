package behavioural.strategy

class DataManager(private val persistenceStrategy: PersistenceStrategy) {
    fun save(key: String, data: String) {
        persistenceStrategy.saveData(key, data)
    }

    fun load(key: String): String? {
        return persistenceStrategy.loadData(key)
    }
}