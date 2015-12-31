package ru.sa2.tests;

import ru.sa2.annotations.RandomInt;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alex on 31.12.2015.
 */
public class RandomIntTest {

        @RandomInt(50)
        static int test =5;

    public static void main(String[] args) throws InterruptedException {

        while (true){

            System.out.println("test = " + test);

            TimeUnit.SECONDS.sleep(2);
        }
    }
}
