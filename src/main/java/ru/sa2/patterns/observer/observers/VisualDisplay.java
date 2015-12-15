package ru.sa2.patterns.observer.observers;

import ru.sa2.patterns.observer.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Alexander Smirnov on 14.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class VisualDisplay implements Observer {

    Observable observable;

    public VisualDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            System.out.println("Hello I'm Visual. Humidity: " + ((WeatherData) o).getHumidity());
        }
    }

    //    @Override
//    public void update(float temp, float hour, float humidity) {
//        System.out.println("Hello I'm Visual. Humidity: " + humidity);
//    }
}
