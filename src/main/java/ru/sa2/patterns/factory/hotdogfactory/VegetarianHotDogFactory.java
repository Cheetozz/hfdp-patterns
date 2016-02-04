package ru.sa2.patterns.factory.hotdogfactory;

import ru.sa2.patterns.factory.hotdog.HotDog;
import ru.sa2.patterns.factory.hotdog.HotDogTypes;
import ru.sa2.patterns.factory.hotdog.VegetChiliPepperHotDog;
import ru.sa2.patterns.factory.hotdog.VegetSimpleHotDog;

/**
 * Created by Alexander Smirnov on 04.02.2016.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class VegetarianHotDogFactory extends HotDogFactory {

    @Override
    HotDog createHotDog(HotDogTypes type) {
        switch (type){
            case SimpleHotDog:
                return new VegetSimpleHotDog();
            case ChiliPepperHotDog:
                return new VegetChiliPepperHotDog();
            default:
                return null;
        }
    }
}