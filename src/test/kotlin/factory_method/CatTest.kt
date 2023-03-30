package factory_method

import org.junit.Assert.*
import org.junit.Test
import org.hamcrest.core.IsInstanceOf.instanceOf
import org.hamcrest.MatcherAssert.assertThat

class CatTest {

    @Test
    fun test_blue_cats_instances() {
        val blueCatHouse = BlueCatHouse()
        val blueCat = blueCatHouse.newCat()

        assertThat(blueCat, instanceOf(BlueCat::class.java))
    }

    @Test
    fun test_red_cats_instances() {
        val redCatHouse = RedCatHouse()
        val redCat = redCatHouse.newCat()

        assertThat(redCat, instanceOf(RedCat::class.java))
    }

    @Test
    fun test_cats_counts() {
        val yellowCatHouse = YellowCatHouse()
        yellowCatHouse.newCat()
        yellowCatHouse.newCat()
        yellowCatHouse.newCat()
        yellowCatHouse.newCat()

        assertEquals(4, yellowCatHouse.catsCount())
    }

    @Test
    fun test_cats_colors() {
        val yellowCatHouse = YellowCatHouse()
        val yellowCat = yellowCatHouse.newCat()
        assertEquals("yellow", yellowCat.color)
    }
}