package singleton

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsInstanceOf.instanceOf
import org.junit.Test
import org.junit.Assert.*

class SingletonTest {

    @Test
    fun test_single_instance() {
        Singleton.addName("MARK")
        Singleton.addName("JOHN")

        assertEquals(listOf("MARK", "JOHN"), Singleton.names())
    }

}