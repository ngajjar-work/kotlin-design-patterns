package creational.prototype

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ShapeManagerShould {


    @Test
    fun createNewCircleObjectUsingPrototypePattern() {

        val uat = ShapeManager()

        //Create Circle Object
        val smallCircle = Circle(5.0, "Red", 0.0, 0.0)

        // Adding default shapes to the manager
        uat.addPrototype("smallCircle", smallCircle)

        // Creating new shapes by cloning prototypes
        val smallCircle1 = uat.createShape("smallCircle") as? Circle
        smallCircle1?.apply {
            x = 10.0
            y = 20.0
        }

        Assertions.assertTrue(smallCircle != smallCircle1)
    }

    @Test
    fun createNewRectangleObjectUsingPrototypePattern() {

        val uat = ShapeManager()

        //Create Rectangle Object
        val largeRectangle = Rectangle(100.0, 200.0, "Blue", 0.0, 0.0)

        // Adding default shapes to the manager
        uat.addPrototype("largeRectangle", largeRectangle)

        // Creating new shapes by cloning prototypes
        val largeRectangle1 = uat.createShape("largeRectangle") as? Rectangle
        largeRectangle1?.apply {
            x = 10.0
            y = 20.0
        }

        Assertions.assertTrue(largeRectangle != largeRectangle1)
    }
}