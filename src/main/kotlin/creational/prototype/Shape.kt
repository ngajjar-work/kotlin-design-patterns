package creational.prototype

/**
 * The Prototype pattern is a creational design pattern in software development.
 * It provides a mechanism to create new objects by cloning existing objects (called prototypes)
 * rather than constructing them from scratch. The cloned object is an exact copy of the original,
 * but it can be modified independently without affecting the original object.
 *
 *
 * Advantage
 * 1. Efficient Object Creation: Reduces the overhead of creating new objects by copying existing prototypes.
 * 2. Dynamic Object Modification: Allows runtime changes to object states and behavior.
 * 3. Flexibility in Object Construction: Supports complex object creation processes by cloning prototypes.
 * 4. Decouples Client from Concrete Classes: Clients use prototype objects rather than concrete classes for creation.
 * 5. Easy Object Customization: Enables easy customization of cloned objects through modification.
 * 6. Reduces Subclassing: Minimizes the need for multiple subclasses for different configurations.
 *
 */

interface Shape : Cloneable {
    public override fun clone(): Shape
    fun draw()
}

data class Circle(
    var radius: Double,
    var color: String,
    var x: Double,
    var y: Double
) : Shape {
    override fun clone(): Shape {
        return copy()
    }

    override fun draw() {
        println("I am drawing Circle")
    }

}

data class Rectangle(
    var width: Double,
    var height: Double,
    var color: String,
    var x: Double,
    var y: Double
) : Shape {
    override fun clone(): Rectangle {
        return copy()
    }

    override fun draw() {
        println("I am drawing Circle")
    }
}