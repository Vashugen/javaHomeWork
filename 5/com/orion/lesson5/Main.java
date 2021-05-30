package com.orion.lesson5;

import com.orion.lesson5.elements.AddElementOnClick;
import com.orion.lesson5.elements.Button;
import com.orion.lesson5.elements.TextField;
import com.orion.lesson5.elements.interfaces.ButtonClickCallback;
import com.orion.lesson5.exceptions.OutOfRangeException;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws OutOfRangeException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Random rand = new Random();
        UI scene = new UI();

        System.out.println("Генерируем элементы: ");
        Button addElementButton = new Button(rand.nextInt(scene.MAX_X), rand.nextInt(scene.MAX_Y), rand.nextInt(scene.MAX_HEIGHT), rand.nextInt(scene.MAX_WEIGHT), "Добавить элемент", false, new AddElementOnClick(scene));
        TextField coordX = new TextField(rand.nextInt(scene.MAX_X), rand.nextInt(scene.MAX_Y), rand.nextInt(scene.MAX_HEIGHT), rand.nextInt(scene.MAX_WEIGHT), "Координата x для нового элемента", false);
        TextField coordY = new TextField(rand.nextInt(scene.MAX_X), rand.nextInt(scene.MAX_Y), rand.nextInt(scene.MAX_HEIGHT), rand.nextInt(scene.MAX_WEIGHT), "Координата y для нового элемента", false);

        System.out.println("Добавляем элементы на \"сцену\": ");
        scene.addElement(addElementButton);
        scene.addElement(coordX);
        scene.addElement(coordY);

        System.out.println("Начинаем работу с элементами: ");
        addElementButton.click();




    }
}
