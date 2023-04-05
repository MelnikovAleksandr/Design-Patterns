package builder

/**

 * This is a Dog class which is designed using the Builder pattern.
 * The Builder pattern is a creational design pattern that lets you construct
 * complex objects step by step, using only the needed pieces of data.
 *
 * @param name The name of the dog.
 * @param kind The kind of dog.
 * @param gender The gender of the dog.
 * @param bornFrom The place where the dog was born.
 * @param weight The weight of the dog.
 */

class Dog private constructor(
    private val name: String,
    private val kind: String,
    private val gender: String,
    private val bornFrom: String,
    private val weight: Int
) {

    override fun toString(): String {
        return "$name, $kind, $gender, $bornFrom, $weight"
    }

    class Builder {
        private var name: String = ""
        private var kind: String = ""
        private var gender: String = ""
        private var bornFrom: String = ""
        private var weight: Int = 0

        fun setName(name: String) = apply {
            this.name = name
        }

        fun setKind(kind: String) = apply {
            this.kind = kind
        }

        fun setGender(gender: String) = apply {
            this.gender = gender
        }

        fun setBornFrom(bornFrom: String) = apply {
            this.bornFrom = bornFrom
        }

        fun setWeight(weight: Int) = apply {
            this.weight = weight
        }

        fun build() = Dog(name, kind, gender, bornFrom, weight)
    }

}
