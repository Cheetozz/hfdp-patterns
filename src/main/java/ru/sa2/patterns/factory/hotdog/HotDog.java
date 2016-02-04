package ru.sa2.patterns.factory.hotdog;


/**
 * Created by Alexander Smirnov on 30.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public interface HotDog {

    void fryBread();

    void putFilling();

    void putSouse();

    void wrapUp();

    String description();

}
