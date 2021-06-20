package com.orion.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        Box boxA = new Box(rand.nextInt(100));
        Box boxB = new Box(new Random().nextInt(10));
        NumberBox boxC = new NumberBox(rand.nextInt(10));


        System.out.println(String.format("Выводим содержимое коробок: " +
                "boxA = %s, boxB = %s boxC = %s", boxA.getContent(), boxB.getContent(), boxC.getContent()));

        System.out.println("Сложим содержимое коробочек: " + boxC.add(boxA).getContent());
        System.out.println("100 * 10 = : " + boxC.multiply(boxA));
        System.out.println("100 + 10 * 10 = : " + boxC.multiply(boxA).add(boxB));

     /*   List<CharSequence> emptyList = new ArrayList<>();


        List<CharSequence> emptyList = new ArrayList<>();
        copyNonEmptyStringBoxToList(Box<String>.of("    "), emptyList); // пустая строка не должна добавиться
        copyNonEmptyStringBoxToList(Box<String>.of("сорок два"), emptyList); // теперь внутри emptyList лежит "сорок два"
        copyNonEmptyStringBoxToList(Box<StringBuilder>.of(new StringBuilder("some value ")), emptyList); // теперь внутри emptyList лежит "сорок два" и "some value"
*/
    }
}
