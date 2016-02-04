package ru.sa2.patterns.factory.hotdogfactory;

import ru.sa2.patterns.factory.hotdog.HotDog;
import ru.sa2.patterns.factory.hotdog.HotDogTypes;

/**
 * Created by Alexander Smirnov on 21.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public abstract class HotDogFactory {

    public HotDog prepareHotDog(HotDogTypes type){

        HotDog hotDog = createHotDog(type);
        hotDog.fryBread();
        hotDog.putFilling();
        hotDog.putSouse();
        hotDog.wrapUp();
        return hotDog;
    }

    abstract HotDog createHotDog(HotDogTypes type);


}
