package creational.prototype

class ShapeManager {
    private val shapePrototypes = mutableMapOf<String, Shape>()

    fun addPrototype(shapeName: String, shape: Shape) {
        shapePrototypes[shapeName] = shape
    }

    fun createShape(shapeName: String): Shape? {
        return shapePrototypes[shapeName]?.clone()
    }
}