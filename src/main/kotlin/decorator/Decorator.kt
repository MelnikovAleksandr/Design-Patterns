package decorator

/**
 * Decorator
 */

interface MyPrinter {
    fun printedText(): String
}

class HelloPrinter : MyPrinter {
    override fun printedText() = "Hello"
}

class CommaPrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() = "${printer.printedText()},"
}

class SpacePrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() = "${printer.printedText()} "
}

class WorldPrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() = "${printer.printedText()}World"
}

class ExclamationPrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() = "${printer.printedText()}!"
}

fun main() {
    val printer = ExclamationPrinter(
        WorldPrinter(
            SpacePrinter(
                CommaPrinter(
                    HelloPrinter()
                )
            )
        )
    )

    println(printer.printedText())
}