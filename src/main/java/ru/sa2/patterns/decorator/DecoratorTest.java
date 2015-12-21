package ru.sa2.patterns.decorator;

import ru.sa2.patterns.decorator.beverage.Beverage;
import ru.sa2.patterns.decorator.beverage.BlackTea;
import ru.sa2.patterns.decorator.beverage.Coffee;
import ru.sa2.patterns.decorator.condiment.Ginger;
import ru.sa2.patterns.decorator.condiment.Lemon;
import ru.sa2.patterns.decorator.condiment.Milk;

/**
 * Created by Alexander Smirnov on 21.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Beverage tea = new BlackTea();
        Beverage condiment = new Lemon(tea);
        condiment = new Ginger(condiment);

        System.out.println(condiment.getDescription() + " cost: " + condiment.getCoast());

        Beverage coffee = new Coffee();
        condiment = new Milk(coffee);
        condiment = new Lemon(condiment);

        System.out.println(condiment.getDescription() + " cost: " + condiment.getCoast());

        Beverage x = new Ginger(new Lemon(new Milk(new BlackTea())));
        System.out.println(x.getDescription() + ": $" + x.getCoast());
    }
}
