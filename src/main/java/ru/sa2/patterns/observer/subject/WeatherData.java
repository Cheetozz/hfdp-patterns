package ru.sa2.patterns.observer.subject;



import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Alexander Smirnov on 14.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class WeatherData extends Observable {
    private List<Observer> observers;
    private float temperature;
    private float hour;
    private float humidity;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measureChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasures(float temp, float hour, float humidity){
        this.temperature = temp;
        this.hour = hour;
        this.humidity = humidity;
        measureChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHour() {
        return hour;
    }

    public float getHumidity() {
        return humidity;
    }
}
