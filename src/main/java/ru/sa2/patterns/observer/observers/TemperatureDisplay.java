package ru.sa2.patterns.observer.observers;

/**
 * Created by Alexander Smirnov on 14.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class TemperatureDisplay implements Observer {

    @Override
    public void update(float temp, float hour, float humidity) {
        System.out.println("Hello I'm Temperature. Hour: " + hour);
    }
}