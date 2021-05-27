package com.orion.lesson5;

import com.orion.lesson5.elements.AddElementOnClick;
import com.orion.lesson5.elements.Button;
import com.orion.lesson5.elements.TextField;
import com.orion.lesson5.elements.interfaces.ButtonClickCallback;
import com.orion.lesson5.exceptions.OutOfRangeException;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws OutOfRangeException {

        Random rand = new Random();
        UI scene = new UI();

        System.out.println("Генерируем элементы: ");
        Button addElementButton = new Button(rand.nextInt(100), rand.nextInt(100), 10, 20, "Добавить элемент", false, new AddElementOnClick(scene));
        TextField coordX = new TextField(rand.nextInt(100), rand.nextInt(100), 10, 20, "Координата x для нового элемента", false);
        TextField coordY = new TextField(rand.nextInt(100), rand.nextInt(100), 10, 20, "Координата y для нового элемента", false);


        System.out.println("Добавляем элементы на \"сцену\": ");

        scene.addElement(addElementButton);
        scene.addElement(coordX);
        scene.addElement(coordY);

        addElementButton.click();




    }
}
