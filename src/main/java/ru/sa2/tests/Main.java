package ru.sa2.tests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alexander Smirnov on 14.12.2015.
 * email:       alexander@pingala.ru
 * email-work:  aleksandrsmirnov@at-consulting.ru
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(2);

        list.add(1);
        list.add(2);

        System.out.println("list = " + list);

        list.add(3);
        list.add(4);

        System.out.println("list = " + list);


    }
}
