package ru.sa2.patterns.factory.hotdogfactory;

import ru.sa2.patterns.factory.hotdog.ChiliPepperHotDog;
import ru.sa2.patterns.factory.hotdog.HotDog;
import ru.sa2.patterns.factory.hotdog.HotDogTypes;
import ru.sa2.patterns.factory.hotdog.SimpleHotDog;

import static ru.sa2.patterns.factory.hotdog.HotDogTypes.*;

/**
 * Created by Alexander Smirnov on 04.02.2016.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class SimpleHotDogFactory extends HotDogFactory {

    @Override
    HotDog createHotDog(HotDogTypes type) {
        switch (type){
            case SimpleHotDog:
                return new SimpleHotDog();
            case ChiliPepperHotDog:
                return new ChiliPepperHotDog();
            default:
                return null;
        }
    }
}
