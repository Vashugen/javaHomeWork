package com.orion.lesson4;

import com.orion.lesson4.character.Charm;

import java.util.Scanner;

public class Game {

    //TODO Модификаторы
    public static Scanner in = new Scanner(System.in);
    public static Scene scene;


    public static void startTheGame(){

        System.out.println("Введите количество магов (1-10): ");
        int mageCount = in.nextInt();

        System.out.println("Введите количество монстров от 1 до : " + (Scene.SCENE_SIZE - mageCount));
        int monsterCount = in.nextInt();

        scene = new Scene(mageCount, monsterCount);

        while(!isFinished()){
            for (int i = 0; i < scene.SCENE_SIZE; i++){

                if(scene.charms[i] != null){
                    makeAMove(scene.charms[i], i);
                }
            }
        }

    }

    private static void makeAMove(Charm charm, int position){
        charm.getDamage(scene.charms);
        //charm.damage(getTarget());
    }

    /*private static Charm getTarget(){
        int a = 1;

        return
    }*/

    private static boolean isFinished(){

        int counter = 0;
        for (Charm item: scene.charms) {
            if(item != null){
                counter ++;
            }
        }

        return counter == 1;
    }


}
