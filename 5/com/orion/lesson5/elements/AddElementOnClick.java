package com.orion.lesson5.elements;

import com.orion.lesson5.UI;
import com.orion.lesson5.elements.interfaces.ButtonClickCallback;
import com.orion.lesson5.exceptions.OutOfRangeException;
import com.orion.lesson5.elements.ElementCollection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class AddElementOnClick implements ButtonClickCallback {

    UI scene;
    Random rand = new Random();

    public AddElementOnClick(UI scene) {
        this.scene = scene;
    }

    @Override
    public void onButtonClick() throws OutOfRangeException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Element toAdd = generateRandomElement();
        scene.addElement(toAdd);

    }

    private Element generateRandomElement() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Map<String, String> paramsList = generateRandomParams();

        //in function()
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        int height = rand.nextInt(100);
        int weight = rand.nextInt(100);
        String caption = "Случайный элемент";
        boolean state = rand.nextBoolean();

        //TODO почему тут не видно enum ElementCollection
        ArrayList<ElementCollection> elementList = new ArrayList<ElementCollection>(Arrays.asList(ElementCollection.values()));

        Element randomClass = elementList.get(rand.nextInt(2)).getData(paramsList);

        try{

            Class<?> randomClass = Class.forName(elementList.get().getClassName());

            try {
                Constructor<?> constructor = randomClass.getConstructor(String.class, Integer.class);
                Object instance = constructor.newInstance(x, y, height, weight, caption, state);
            }catch(NoSuchMethodException e){
                e.getStackTrace();
            };

        }catch (ClassNotFoundException e){
            e.getStackTrace();
        };

        //размер enum'a
        switch (rand.nextInt(3)){

            case 0:
                return new Button(x, y, height, weight, caption, state, new AddElementOnClick(scene));
            case 1:
                return new TextField(rand.nextInt(100), rand.nextInt(100), 10, 20, "Координата x для нового элемента", false);
            case 2:
                return new CheckBox(rand.nextInt(100), rand.nextInt(100), 10, 20, "Координата x для нового элемента", false);
        }

        return  new Button(rand.nextInt(100), rand.nextInt(100), 10, 20, "Случайный элемент", false, new AddElementOnClick(scene));
    }

    private Map<String, String> generateRandomParams(){

        return Map

    }
}
