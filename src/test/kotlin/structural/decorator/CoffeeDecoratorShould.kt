package structural.decorator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CoffeeDecoratorShould {


    @Test
    fun `calculate cost and description for SimpleCoffee`() {
        // Given
        val coffee: Coffee = SimpleCoffee()

        // Then
        assertThat(coffee.cost()).isEqualTo(5.0)
        assertThat(coffee.description()).isEqualTo("Simple Coffee")
    }

    @Test
    fun `calculate cost and description for Coffee with Milk`() {
        // Given
        var coffee: Coffee = SimpleCoffee()
        coffee = MilkDecorator(coffee)

        // Then
        assertThat(coffee.cost()).isEqualTo(6.5)
        assertThat(coffee.description()).isEqualTo("Simple Coffee, Milk")
    }

    @Test
    fun `calculate cost and description for Coffee with Milk and Sugar`() {
        // Given
        var coffee: Coffee = SimpleCoffee()
        coffee = MilkDecorator(coffee)
        coffee = SugarDecorator(coffee)

        // Then
        assertThat(coffee.cost()).isEqualTo(7.0)
        assertThat(coffee.description()).isEqualTo("Simple Coffee, Milk, Sugar")
    }

}