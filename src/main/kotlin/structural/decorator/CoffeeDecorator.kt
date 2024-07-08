package structural.decorator

/**
 * The Decorator Pattern is a structural design pattern that allows behavior to be added to
 * individual objects, either statically or dynamically, without affecting the behavior of other
 * objects from the same class. It provides a flexible alternative to subclassing for extending functionality.
 *
 * Advantages
 * 1. Flexibility: Adds new functionality to objects at runtime without altering existing code.
 * 2. Reusability: Reuses existing code and decorates it with additional responsibilities.
 * 3. Maintainability: Avoids the need for extensive subclass hierarchies and reduces code duplication.
 * 4. Open/Closed Principle: Follows the principle that classes should be open for extension but closed for modification.
 */

abstract class CoffeeDecorator(private val decoratedCoffee: Coffee) : Coffee by decoratedCoffee {
    override fun cost() = decoratedCoffee.cost()
    override fun description() = decoratedCoffee.description()
}

class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost() = super.cost() + 1.5
    override fun description() = super.description() + ", Milk"
}

class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost() = super.cost() + 0.5
    override fun description() = super.description() + ", Sugar"
}