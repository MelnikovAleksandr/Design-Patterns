package prototype

/**
 * This code demonstrates the Prototype design pattern in Kotlin.
 * The `Prototype` interface defines the `clone()` method that creates a copy of an object.
 * The `User` class implements the `Prototype` interface and contains properties for the user's name, age, and email.
 * The `clone()` method is overridden in the `User` class to create a copy of the `User` object.
 */

interface Prototype {

    /**
     * Creates a new copy of an object.
     *
     * @return A new copy of the object.
     */

    fun clone(): Prototype
}

class User(var name: String, var age: Int, var email: String) : Prototype {

    override fun clone(): User {
        return User(name, age, email)
    }

    fun printInfo() {
        println("$name, $age years old, email: $email")
    }
}

fun main() {
    val user = User("John Doe", 25, "johndoe@example.com")

    val clonedUser = user.clone()

    clonedUser.name = "Jane Doe"
    clonedUser.age = 30
    clonedUser.email = "janedoe@example.com"

    user.printInfo()
    clonedUser.printInfo()
}
