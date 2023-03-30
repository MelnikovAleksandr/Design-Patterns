package factory_method

/**
 * Factory method
 */

abstract class Cat {
    abstract val color: String
}

class BlueCat(override val color: String = "blue") : Cat()
class RedCat(override val color: String = "red") : Cat()
class YellowCat(override val color: String = "yellow") : Cat()

abstract class CatHouse {

    private var catCounter = 0

    abstract fun cat(): Cat

    fun newCat(): Cat {
        catCounter++
        return cat()
    }

    fun catsCount() = catCounter
}

class BlueCatHouse : CatHouse() {
    override fun cat(): Cat = BlueCat()
}

class RedCatHouse : CatHouse() {
    override fun cat(): Cat = RedCat()
}

class YellowCatHouse : CatHouse() {
    override fun cat(): Cat = YellowCat()
}


















