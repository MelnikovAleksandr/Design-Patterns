package decorator

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsInstanceOf.instanceOf
import org.junit.Test
import org.junit.Assert.*
import org.junit.jupiter.api.Assertions

class DecoratorTest {
    @Test
    fun test_printed_fun() {
        val printer = ExclamationPrinter(
            WorldPrinter(
                SpacePrinter(
                    CommaPrinter(
                        HelloPrinter()
                    )
                )
            )
        )
        Assertions.assertEquals("Hello, World!", printer.printedText())
    }
}