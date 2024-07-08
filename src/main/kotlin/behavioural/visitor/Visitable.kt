package behavioural.visitor

// Define the Visitable interface
interface Visitable {
    fun accept(visitor: TaxVisitor)
}


// Concrete Visitable items
class Book(val title: String, val price: Double) : Visitable {
    override fun accept(visitor: TaxVisitor) {
        visitor.visit(this)
    }
}

class Electronics(val name: String, val price: Double) : Visitable {
    override fun accept(visitor: TaxVisitor) {
        visitor.visit(this)
    }
}

class Clothing(val type: String, val price: Double) : Visitable {
    override fun accept(visitor: TaxVisitor) {
        visitor.visit(this)
    }
}
