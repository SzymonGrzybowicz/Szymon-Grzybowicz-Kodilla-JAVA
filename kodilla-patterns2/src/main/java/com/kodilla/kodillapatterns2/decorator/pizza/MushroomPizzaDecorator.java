package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomPizzaDecorator extends AbstractPizzaOrderDecorator {

    public MushroomPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + mushroom";
    }
}