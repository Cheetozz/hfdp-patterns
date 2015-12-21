package ru.sa2.patterns.decorator.beverage;

/**
 * Created by Alexander Smirnov on 21.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public abstract class Beverage {
    String description = "Default beverage description.";

    public String getDescription() {
        return description;
    }

    public abstract double getCoast();
}
