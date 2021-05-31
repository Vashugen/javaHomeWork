package com.orion.lesson5.elements;

import com.orion.lesson5.UI;
import com.orion.lesson5.elements.interfaces.ButtonClickCallback;
import com.orion.lesson5.exceptions.OutOfRangeException;
//import com.orion.lesson5.elements.ElementCollection;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class AddElementOnClick implements ButtonClickCallback {

    UI scene;
    Random rand = new Random();

    public AddElementOnClick(UI scene) {
        this.scene = scene;
    }

    @Override
    //public void onButtonClick() throws OutOfRangeException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    public void onButtonClick() throws OutOfRangeException {
        Element toAdd = generateRandomElement();
        scene.addElement(toAdd);

    }

    private Element generateRandomElement() {

       // Map<String, Integer> paramsList = generateRandomParams();

        //in function()
        int x = rand.nextInt(scene.MAX_X);
        int y = rand.nextInt(scene.MAX_Y);
        int height = rand.nextInt(Element.MAX_HEIGHT);
        int weight = rand.nextInt(Element.MAX_WEIGHT);
        String caption = "Случайный элемент";
        boolean state = false;

        //TODO почему тут не видно enum ElementCollection
        //ArrayList<ElementCollection> elementList = new ArrayList<ElementCollection>(Arrays.asList(ElementCollection.values()));

        //Element randomClass = elementList.get(rand.nextInt(2)).getElement(paramsList, "Случайный элемент", scene);

        //размер enum'a
        switch (rand.nextInt(3)){

            case 0:
                return new Button(x, y, height, weight, "Кнопка в <x, y>", state, new ShowCoordinates(x, y));
            case 1:
                return new TextField(x, y, height, weight, caption, state, Integer.toString(rand.nextInt(10)));
            case 2:
                return new CheckBox(x, y, height, weight, caption, rand.nextBoolean());
            default:
                throw new IllegalStateException("Unexpected value: " + rand.nextInt(3));
        }
    }

    private Map<String, Integer> generateRandomParams(){

        Map <String, Integer> paramsList = new HashMap<String, Integer>();

        paramsList.put("x", rand.nextInt(scene.MAX_X));
        paramsList.put("y", rand.nextInt(scene.MAX_Y));
        paramsList.put("weight", rand.nextInt(Element.MAX_WEIGHT));
        paramsList.put("height", rand.nextInt(Element.MAX_HEIGHT));

        return paramsList;


    }
}
