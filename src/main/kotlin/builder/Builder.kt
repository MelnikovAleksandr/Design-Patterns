package builder

/**
A builder is a generative design pattern
that allows you to create complex objects step by step.
The builder makes it possible to use the same
construction code to get different
representations of objects.
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
