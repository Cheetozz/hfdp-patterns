package ru.sa2.patterns.decorator.condiment;

import ru.sa2.patterns.decorator.beverage.Beverage;

/**
 * Created by Alexander Smirnov on 21.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCoast() {
        return beverage.getCoast() + 0.3;
    }
}
