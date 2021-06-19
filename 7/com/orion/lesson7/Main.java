package com.orion.lesson7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        Box boxA = new Box(rand.nextInt(100));
        Box boxB = new Box(new Random().nextInt(10));
        NumberBox boxC = new NumberBox(rand.nextInt(10));


        //System.out.println("Сложим содержимое коробочек: " + boxB.add(boxA));
        System.out.println("100 * 10 = : " + boxC.multiply(boxA));
        System.out.println("100 + 10 * 10 = : " + boxC.multiply(boxA));


    }
}
