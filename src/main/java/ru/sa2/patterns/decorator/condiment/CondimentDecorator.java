package ru.sa2.patterns.decorator.condiment;

import ru.sa2.patterns.decorator.beverage.Beverage;

/**
 * Created by Alexander Smirnov on 21.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
