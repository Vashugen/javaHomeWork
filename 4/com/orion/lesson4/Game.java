package com.orion.lesson4;

import com.orion.lesson4.character.Charm;
import com.orion.lesson4.spell.Lighting;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class Game {

    public static Scanner in = new Scanner(System.in);
    public static Scene scene;

    public static void startTheGame(){

        System.out.println("Введите количество магов (1-10): ");
        int mageCount = in.nextInt();

        System.out.println("Введите количество монстров от 1 до : " + (Scene.SCENE_SIZE - mageCount));
        int monsterCount = in.nextInt();

        scene = new Scene(mageCount, monsterCount);

        System.out.println("Наблюдайте за игрой!");

        while(!haveAWinner()){
            for (int i = 0; i < scene.SCENE_SIZE; i++) {
                if(scene.charms[i] != null){
                    scene.charms[i].action(scene.charms);
                }
            }

            scene.clear();
        }
    }

    private static boolean haveAWinner(){

        int nullElements = Collections.frequency(Arrays.asList(scene.charms), null);
        return (scene.SCENE_SIZE - nullElements) == 1;

    }

}
