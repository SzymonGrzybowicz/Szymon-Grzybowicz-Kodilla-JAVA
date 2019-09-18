package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithMushroom() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomPizzaDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(20), cost);
        Assert.assertEquals("Basic pizza with tomato sauce and cheese + mushroom", description);
    }

    @Test
    public void testPizzaOrderWithSalamiMushroomAndCheese () {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiPizzaDecorator(pizzaOrder);
        pizzaOrder = new MushroomPizzaDecorator(pizzaOrder);
        pizzaOrder = new CheesePizzaDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(35), cost);
        Assert.assertEquals("Basic pizza with tomato sauce and cheese + salami + mushroom + cheese", description);
    }
}
