package structural.decorator

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