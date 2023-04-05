package abstract_factory

/**
 * This code demonstrates the Abstract Factory design pattern in Kotlin.
 *
 * The `Button` interface defines the `draw()` method for drawing buttons.
 * The `AndroidButton` and `IosButton` classes implement the `Button` interface for Android and iOS devices, respectively.
 *
 * The `Text` interface defines the `draw()` method for drawing text.
 * The `AndroidText` and `IosText` classes implement the `Text` interface for Android and iOS devices, respectively.
 *
 * The `ButtonFactory` interface defines the `createButton()` and `createText()` methods for creating `Button` and `Text` objects, respectively.
 * The `AndroidButtonFactory` and `IOSButtonFactory` classes implement the `ButtonFactory` interface for Android and iOS devices, respectively.
 *
 * Each `ButtonFactory` implementation creates instances of `AndroidButton`/`IosButton` and `AndroidText`/`IosText` classes
 * which can be used interchangeably in a specific mobile application.
 */

interface Button {
    fun draw(): String
}

class AndroidButton() : Button {
    override fun draw() = "Android Button"
}

class IosButton : Button {
    override fun draw() = "IOS Button"
}

interface Text {
    fun draw(): String
}

class AndroidText : Text {
    override fun draw() = "Android Text"
}

class IosText : Text {
    override fun draw() = "IOS Text"
}

interface ButtonFactory {
    fun createButton(): Button
    fun createText(): Text
}

class AndroidButtonFactory : ButtonFactory {
    override fun createButton(): Button = AndroidButton()
    override fun createText(): Text = AndroidText()
}

class IOSButtonFactory : ButtonFactory {
    override fun createButton(): Button = IosButton()
    override fun createText(): Text = IosText()
}























