package facade

/**
 * Facade
 */

class LocalDataSource {
    private val data = mutableListOf<String>()

    fun save(data: List<String>) {
        this.data.addAll(data)
    }

    fun read() = data

    fun isEmpty() = data.isEmpty()
}

class NetworkDataSource {
    fun get() = listOf(
        "Harry",
        "Ronald",
        "Hermione"
    )
}

class Repository(private val localDataSource: LocalDataSource, private val networkDataSource: NetworkDataSource) {
    fun fetch(): List<String> {
        if (localDataSource.isEmpty()) {
            val data = networkDataSource.get()
            localDataSource.save(data)
        }
        return localDataSource.read()
    }
}














