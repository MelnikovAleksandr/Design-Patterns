package abstract_factory

/**
An abstract factory is a generative
design pattern that allows you to create families
of related objects without being tied to specific
classes of objects being created.
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























