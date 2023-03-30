package singleton

/**
 * Singleton
 */

object Singleton {
    private val names = mutableListOf<String>()

    fun addName(name: String) {
        names.add(name)
    }

    fun names() = names.toList()
}