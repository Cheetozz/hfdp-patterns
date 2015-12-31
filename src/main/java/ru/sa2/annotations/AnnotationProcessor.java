package ru.sa2.annotations;

import ru.sa2.tests.RandomIntTest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Random;

/**
 * Created by Alex on 31.12.2015.
 */
public class AnnotationProcessor {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        init(RandomIntTest.class);
//        init(String.class);

    }

    static void init(Class<?> classForRandom) throws IllegalAccessException, NoSuchFieldException {

        RandomInt[] annotations = classForRandom.getAnnotationsByType(RandomInt.class);

        Field[] fields = classForRandom.getDeclaredFields();

        fields[0].isAnnotationPresent(RandomInt.class);


        for (Field field : classForRandom.getDeclaredFields()){
            if (field.isAnnotationPresent(RandomInt.class)){
                System.out.println("Found field with annotation RandomInt:\t" + field.getName());

                if (field.getType() == Integer.class ||
                        field.getType() == int.class){
                    RandomInt annotation = field.getAnnotation(RandomInt.class);
                    int value = new Random().nextInt(annotation.value() - annotation.min()) + annotation.min();

                    field.setAccessible(true);


                    Field modifiersField = Field.class.getDeclaredField("modifiers");
                    modifiersField.setAccessible(true);
                    modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

                    field.setInt(null, value);

                    System.out.println();
                } else {
                    System.out.println("Wrong type for field:\t" + field.getName());
                }


            }
        }

    }
}
