package ru.sa2.patterns.factory.hotdog;

/**
 * Created by Alexander Smirnov on 04.02.2016.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class VegetSimpleHotDog implements HotDog {

    @Override
    public void fryBread() {

    }

    @Override
    public void putFilling() {

    }

    @Override
    public void putSouse() {

    }

    @Override
    public void wrapUp() {

    }

    @Override
    public String description() {
        return getClass().getSimpleName();
    }
}