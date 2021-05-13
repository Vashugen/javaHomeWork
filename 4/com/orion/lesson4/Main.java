package com.orion.lesson4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scene scene = new Scene();

        System.out.println("Введите количество магов: ");
        Scanner in = new Scanner(System.in);
        int mageCount = in.nextInt();

        //проверка на превышение количества магов

        System.out.println("Введите количество монстров: ");
        int monsterCount = in.nextInt();

        scene.fill(mageCount, monsterCount);




    }

}
