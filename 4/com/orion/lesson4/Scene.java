package com.orion.lesson4;

import com.orion.lesson4.character.Charm;
import com.orion.lesson4.character.Mage;
import com.orion.lesson4.character.Monster;

import java.util.*;

public class Scene {

    final static int SCENE_SIZE = 10;
    public Map<Integer, Charm> charms = new HashMap<Integer, Charm>();

    public Scene(int mageCount, int monsterCount) {

        Random rand = new Random();
        int freePoint;

        for (int i = 1; i <= mageCount; i++) {

            do {
                freePoint = rand.nextInt(SCENE_SIZE - 1);
            } while (charms.containsKey(freePoint));

            charms.put(freePoint, new Mage(String.valueOf(i)));
        }

        for (int i = 1; i <= monsterCount; i++) {
            do {
                freePoint = rand.nextInt(SCENE_SIZE - 1);
            } while (charms.containsKey(freePoint));

            charms.put(freePoint, new Monster(String.valueOf(i)));
        }
    }

/*
    public void clear() {

        */
/*int nullElements = Collections.frequency(Arrays.asList(scene.charms), null);
        return (scene.SCENE_SIZE - nullElements) == 1;*//*



        for (int i = 0; i < SCENE_SIZE; i++) {
            if (charms[i] != null && charms[i].getHitPoint() <= 0) {
                charms[i] = null;
            }
        }
    }
*/

}
