package ru.sa2.patterns.observer.observers;

import ru.sa2.patterns.observer.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Alexander Smirnov on 14.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class TemperatureDisplay implements Observer {

    Observable observable;

    public TemperatureDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            System.out.println("Hello I'm Temperature. Hour: " + ((WeatherData) o).getHour());
        }
    }

    //    @Override
//    public void update(float temp, float hour, float humidity) {
//        System.out.println("Hello I'm Temperature. Hour: " + hour);
//    }
}