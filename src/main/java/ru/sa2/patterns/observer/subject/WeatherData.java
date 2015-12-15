package ru.sa2.patterns.observer.subject;

import ru.sa2.patterns.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander Smirnov on 14.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class WeatherData  implements Subject {
    private List<Observer> observers;
    float temperature;
    float hour;
    float humidity;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer... o) {
        for (Observer insert : o)
            observers.add(insert);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0)
            observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers)
            o.update(temperature, hour, humidity);
    }
    public void measureChanged() {
        notifyObservers();
    }

    public void setMeasures(float temp, float hour, float humidity){
        this.temperature = temp;
        this.hour = hour;
        this.humidity = humidity;
        measureChanged();
    }
}
