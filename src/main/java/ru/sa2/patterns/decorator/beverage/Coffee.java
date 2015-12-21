package ru.sa2.patterns.decorator.beverage;

/**
 * Created by Alexander Smirnov on 21.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class Coffee extends Beverage {

    public Coffee() {
        description = "Black Coffee";
    }

    @Override
    public double getCoast() {
        return 1.5;
    }
}
