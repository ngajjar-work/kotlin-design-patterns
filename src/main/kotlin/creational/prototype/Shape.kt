package creational.prototype

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