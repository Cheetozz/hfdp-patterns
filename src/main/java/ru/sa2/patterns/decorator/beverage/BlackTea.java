package ru.sa2.patterns.decorator.beverage;

/**
 * Created by Alexander Smirnov on 21.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class BlackTea extends Beverage {

    public BlackTea() {
        description = "Black Tea";
    }

    @Override
    public double getCoast() {
        return 1;
    }
}
