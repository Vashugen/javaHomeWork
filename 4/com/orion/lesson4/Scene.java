package com.orion.lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scene {

    final int CHARACTER_COUNT = 10;
    Random rand = new Random();
    Character[] scene;

    public Scene(int mageCount, int monsterCount) {

        for (int i = 0; i < mageCount; i++){
            scene[rand.nextInt(CHARACTER_COUNT)] = new Mage(String.valueOf(i));
        }

    }

    static final public int fieldsCount = 10;

    static public int[] scene;

    public void fill(int mageCount, int monsterCount){

        //заполняем магами
        //заполняем монстрами с проверкой на колво

    }

}
