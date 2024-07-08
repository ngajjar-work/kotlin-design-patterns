package behavioural.visitor

/**
 * The Visitor Pattern is a behavioral design pattern that allows adding new operations to objects without modifying
 * their classes. It separates algorithms from the objects on which they operate and centralizes the operations in one place.
 *
 * Advantages
 * 1. Separation of Concerns: Separates algorithms from the objects they operate on, improving code organization.
 * 2. Adding Operations: Facilitates the addition of new operations without altering the classes of the elements.
 * 3. Open/Closed Principle: Extends operations to new types of elements without changing existing code.
 * 4. Easy Maintenance: Centralizes modifications to operations within the Visitor implementation, making it easier to maintain.
 */

// Define the Visitor interface
interface TaxVisitor {
    fun visit(item: Book)
    fun visit(item: Electronics)
    fun visit(item: Clothing)
}

// Concrete Visitor
class TaxCalculator : TaxVisitor {
    var totalTax: Double = 0.0

    override fun visit(item: Book) {
        // Books are tax-free
        println("Book: ${item.title}, Price: ${item.price}, Tax: $0.00")
    }

    override fun visit(item: Electronics) {
        // Electronics are taxed at 20%
        val tax = item.price * 0.20
        println("Electronics: ${item.name}, Price: ${item.price}, Tax: $tax")
        totalTax += tax
    }

    override fun visit(item: Clothing) {
        // Clothing is taxed at 10%
        val tax = item.price * 0.10
        println("Clothing: ${item.type}, Price: ${item.price}, Tax: $tax")
        totalTax += tax
    }
}
