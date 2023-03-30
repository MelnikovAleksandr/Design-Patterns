package abstract_factory

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsInstanceOf.instanceOf
import org.junit.Test
import org.junit.Assert.*

class AbstractFactoryTest {

    @Test
    fun test_instances() {

        val iosFactory = IOSButtonFactory()
        val iosButton = iosFactory.createButton()
        val iosText = iosFactory.createText()

        assertThat(iosButton, instanceOf(IosButton::class.java))
        assertThat(iosText, instanceOf(IosText::class.java))

        val androidFactory = AndroidButtonFactory()
        val androidButton = androidFactory.createButton()
        val androidText = androidFactory.createText()

        assertThat(androidButton, instanceOf(AndroidButton::class.java))
        assertThat(androidText, instanceOf(AndroidText::class.java))

    }

    @Test
    fun check_buttons_draw_fun() {
        val iosFactory = IOSButtonFactory()
        val iosButton = iosFactory.createButton()
        val iosText = iosFactory.createText()

        val androidFactory = AndroidButtonFactory()
        val androidButton = androidFactory.createButton()
        val androidText = androidFactory.createText()

        assertEquals("Android Button", androidButton.draw())
        assertEquals("Android Text", androidText.draw())
        assertEquals("IOS Button", iosButton.draw())
        assertEquals("IOS Text", iosText.draw())
    }
}












