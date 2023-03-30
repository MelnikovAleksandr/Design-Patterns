package builder

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsInstanceOf.instanceOf
import org.junit.Test
import org.junit.Assert.*

class BuilderTest {

    @Test
    fun test_instances() {
        val name = "Max"
        val kind = "Sheepdog"
        val gender = "M"
        val bornFrom = "Mexico"
        val weight = 24

        val dog = Dog.Builder()
            .setName(name)
            .setKind(kind)
            .setGender(gender)
            .setBornFrom(bornFrom)
            .setWeight(weight)
            .build()

        val dog2 = Dog.Builder()
            .setName(name)
            .setWeight(40)
            .build()

        assertEquals("$name, $kind, $gender, $bornFrom, $weight", dog.toString())
        assertEquals("$name, ${""}, ${""}, ${""}, 40", dog2.toString())
    }

}