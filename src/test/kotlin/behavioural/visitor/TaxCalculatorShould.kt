package behavioural.visitor

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TaxCalculatorShould {

    private lateinit var taxCalculator: TaxCalculator
    private lateinit var book: Book
    private lateinit var electronics: Electronics
    private lateinit var clothing: Clothing

    @BeforeEach
    fun setUp() {
        taxCalculator = TaxCalculator()
        book = Book("Kotlin Programming", 39.99)
        electronics = Electronics("Smartphone", 699.99)
        clothing = Clothing("Jeans", 49.99)
    }

    @Test
    fun calculateTaxForBook() {
        book.accept(taxCalculator)
        assertEquals(0.0, taxCalculator.totalTax, 0.01)
    }

    @Test
    fun calculateTaxForElectronics() {
        electronics.accept(taxCalculator)
        assertEquals(139.998, taxCalculator.totalTax, 0.01) // 20% of 699.99
    }

    @Test
    fun calculateTaxForClothing() {
        clothing.accept(taxCalculator)
        assertEquals(4.999, taxCalculator.totalTax, 0.01) // 10% of 49.99
    }

    @Test
    fun calculateTotalTaxCorrectly() {
        book.accept(taxCalculator)
        electronics.accept(taxCalculator)
        clothing.accept(taxCalculator)
        assertEquals(144.997, taxCalculator.totalTax, 0.01) // 20% of 699.99 + 10% of 49.99
    }
}