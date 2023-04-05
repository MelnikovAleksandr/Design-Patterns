package prototype

import org.junit.Assert.*
import org.junit.Test

class PrototypeTest {

    @Test
    fun testClone() {
        val user = User("John Doe", 25, "johndoe@example.com")
        val clonedUser = user.clone()

        assertNotEquals(user, clonedUser)
        assertEquals(user.name, clonedUser.name)
        assertEquals(user.age, clonedUser.age)
        assertEquals(user.email, clonedUser.email)
    }
}