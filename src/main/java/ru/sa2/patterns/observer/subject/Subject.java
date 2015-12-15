package ru.sa2.patterns.observer.subject;

import ru.sa2.patterns.observer.observers.Observer;

/**
 * Created by Alexander Smirnov on 14.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public interface Subject {
    void registerObserver(Observer... o);
    void removeObserver(Observer o);
    void notifyObservers();

}
