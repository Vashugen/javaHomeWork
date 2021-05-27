package com.orion.lesson5.elements;

import com.orion.lesson5.UI;
import com.orion.lesson5.elements.interfaces.ButtonClickCallback;
import com.orion.lesson5.exceptions.OutOfRangeException;

import java.util.Random;

public class AddElementOnClick implements ButtonClickCallback {

    UI scene;
    Random rand = new Random();

    public AddElementOnClick(UI scene) {
        this.scene = scene;
    }

    @Override
    public void onButtonClick() throws OutOfRangeException {
        Element toAdd = generateRandomElement();
        scene.addElement(toAdd);

    }

    private Element generateRandomElement(){
        //TODO сюда в зависимости от rand() на лету генерировть по имени/etc класса тип
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        int height = rand.nextInt(100);
        int weight = rand.nextInt(100);
        String caption = "Случайный элемент";
        boolean state = rand.nextBoolean();

        //размер enum'a
        switch (rand.nextInt(3)){

            case 0:
                return new Button(rand.nextInt(100), rand.nextInt(100), 10, 20, "Случайный элемент", false, new AddElementOnClick(scene));
            case 1:
                return new TextField(rand.nextInt(100), rand.nextInt(100), 10, 20, "Координата x для нового элемента", false);
            case 2:
                return new CheckBox(rand.nextInt(100), rand.nextInt(100), 10, 20, "Координата x для нового элемента", false);
        }

        return  new Button(rand.nextInt(100), rand.nextInt(100), 10, 20, "Случайный элемент", false, new AddElementOnClick(scene));
    }
}
