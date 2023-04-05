package decorator

/**
This is an example of the Decorator design pattern.
The MyPrinter interface defines the common functionality for printers.
The HelloPrinter class implements the MyPrinter interface and prints "Hello".
The CommaPrinter, SpacePrinter, WorldPrinter, and ExclamationPrinter classes are decorators that modify the output of
other printers. They each take another MyPrinter object as a constructor argument and modify the printed text
by appending a comma, space, "World", or exclamation mark, respectively.
The main function creates an ExclamationPrinter object that wraps a WorldPrinter, which wraps a SpacePrinter,
which wraps a CommaPrinter, which finally wraps a HelloPrinter. When printed, the output is "Hello, World!".
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