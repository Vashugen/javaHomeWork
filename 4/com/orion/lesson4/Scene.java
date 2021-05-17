package com.orion.lesson4;

import com.orion.lesson4.character.Mage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scene {

    final static int SCENE_SIZE = 10;
    public Character[] scene = new Character[SCENE_SIZE];
    public Random rand = new Random();

    public Scene(int mageCount, int monsterCount) {

        for (int i = 1; i <= mageCount; i++) {
            scene[rand.nextInt(SCENE_SIZE - 1)] = new Mage(String.valueOf(i));
        }

    }

}
