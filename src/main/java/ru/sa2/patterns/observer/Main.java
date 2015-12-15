package ru.sa2.patterns.observer;

import ru.sa2.patterns.observer.observers.StatisticalDisplay;
import ru.sa2.patterns.observer.observers.TemperatureDisplay;
import ru.sa2.patterns.observer.observers.VisualDisplay;
import ru.sa2.patterns.observer.subject.WeatherData;

/**
 * Created by Alexander Smirnov on 15.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class Main {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        VisualDisplay visualDisplay = new VisualDisplay();
        wd.registerObserver(new StatisticalDisplay(), new TemperatureDisplay(), visualDisplay);

        wd.setMeasures(0, 0, 0);

        System.out.println("=====================================");
        wd.removeObserver(visualDisplay);
        wd.setMeasures((float)2.3, (float)6.666, 89);
    }
}
