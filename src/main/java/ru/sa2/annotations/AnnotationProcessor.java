package ru.sa2.annotations;

import ru.sa2.tests.RandomIntTest;

/**
 * Created by Alex on 31.12.2015.
 */
public class AnnotationProcessor {

    public static void main(String[] args) {
        init(RandomIntTest.class);
        init(String.class);

    }

    static void init(Class<?> classForRandom){

        RandomInt[] annotations = classForRandom.getAnnotationsByType(RandomInt.class);

    }
}
