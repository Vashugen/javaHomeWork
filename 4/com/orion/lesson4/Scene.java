package com.orion.lesson4;

import com.orion.lesson4.character.Charm;
import com.orion.lesson4.character.Mage;
import com.orion.lesson4.character.Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scene {

    final static int SCENE_SIZE = 10;
    public Charm[] charms = new Charm[SCENE_SIZE];

    public Scene(int mageCount, int monsterCount) {

        for (int i = 1; i <= mageCount; i++) {
            charms[getFreePoint()] = new Mage(String.valueOf(i));
        }

        for (int i = 1; i <= monsterCount; i++) {
            charms[getFreePoint()] = new Monster(String.valueOf(i));
        }

    }

    private int getFreePoint(){

        Random rand = new Random();
        int freePoint = rand.nextInt(SCENE_SIZE - 1);

        while (charms[freePoint] != null){
            freePoint = rand.nextInt(SCENE_SIZE - 1);
        }

        return freePoint;
    }

}
