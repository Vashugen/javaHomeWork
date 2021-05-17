package com.orion.lesson4;

import java.util.Scanner;

public class Game {

    public static void startTheGame(){

        System.out.println("Введите количество магов (1-10): ");
        int mageCount = in.nextInt();

        System.out.println("Введите количество монстров от 1 до : " + (Scene.SCENE_SIZE - mageCount));
        int monsterCount = in.nextInt();

        Scene scene = new Scene(mageCount, monsterCount);

    }


}
