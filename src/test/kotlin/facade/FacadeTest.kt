package facade

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class FacadeTest {

    @Test
    fun test_fetch_data() {
        val facade = Repository(LocalDataSource(), NetworkDataSource())
        val data = facade.fetch()
        assertEquals(listOf("Harry", "Ronald", "Hermione"), data)
    }
}