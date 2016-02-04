package ru.sa2.patterns.factory;

import ru.sa2.patterns.factory.hotdog.HotDogTypes;
import ru.sa2.patterns.factory.hotdogfactory.HotDogFactory;
import ru.sa2.patterns.factory.hotdogfactory.SimpleHotDogFactory;
import ru.sa2.patterns.factory.hotdogfactory.VegetarianHotDogFactory;

/**
 * Created by Alexander Smirnov on 04.02.2016.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class FactoryTest {

    public static void main(String[] args) {
        HotDogFactory factory = new SimpleHotDogFactory();

        System.out.println(factory.prepareHotDog(HotDogTypes.SimpleHotDog).description());
        System.out.println(factory.prepareHotDog(HotDogTypes.ChiliPepperHotDog).description());


        factory = new VegetarianHotDogFactory();

        System.out.println(factory.prepareHotDog(HotDogTypes.SimpleHotDog).description());
        System.out.println(factory.prepareHotDog(HotDogTypes.ChiliPepperHotDog).description());

    }
}
