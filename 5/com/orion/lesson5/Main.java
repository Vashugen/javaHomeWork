package com.orion.lesson5;

import com.orion.lesson5.elements.AddElementOnClick;
import com.orion.lesson5.elements.Button;
import com.orion.lesson5.elements.Element;
import com.orion.lesson5.elements.TextField;
import com.orion.lesson5.elements.interfaces.ButtonClickCallback;
import com.orion.lesson5.elements.interfaces.Clickable;
import com.orion.lesson5.exceptions.OutOfRangeException;
import com.orion.lesson5.exceptions.ReadOnlyException;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws OutOfRangeException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ReadOnlyException {

        Random rand = new Random();
        UI scene = new UI();

        System.out.println("Генерируем элементы: ");
        Button addElementButton = new Button(rand.nextInt(scene.MAX_X), rand.nextInt(scene.MAX_Y), rand.nextInt(Element.MAX_HEIGHT), rand.nextInt(Element.MAX_WEIGHT), "Добавить элемент", false, new AddElementOnClick(scene));
        TextField coordX = new TextField(rand.nextInt(scene.MAX_X), rand.nextInt(scene.MAX_Y), rand.nextInt(Element.MAX_HEIGHT), rand.nextInt(Element.MAX_WEIGHT), "Координата x для нового элемента", false, "");
        TextField coordY = new TextField(rand.nextInt(scene.MAX_X), rand.nextInt(scene.MAX_Y), rand.nextInt(Element.MAX_HEIGHT), rand.nextInt(Element.MAX_WEIGHT), "Координата y для нового элемента", false, "");

        System.out.println("Добавляем элементы на \"сцену\": ");
        scene.addElement(addElementButton);
        scene.addElement(coordX);
        scene.addElement(coordY);

        System.out.println("Тестируем работу с элементами: ");
        coordX.setText(Integer.toString(rand.nextInt(scene.MAX_X)));
        coordY.setText(Integer.toString(rand.nextInt(scene.MAX_Y)));
        addElementButton.click();

        System.out.println("Запускаем работу с элементами: ");
        for (int i = 0; i < 10; i++) {
            coordX.setText(Integer.toString(rand.nextInt(scene.MAX_X)));
            coordY.setText(Integer.toString(rand.nextInt(scene.MAX_Y)));
            addElementButton.click();
        }

        System.out.println("Выводим созданные элементы: ");
        for (Element element : scene.getAllElements()) {
            element.getDescription();

            if (element instanceof Clickable) {
                ((Clickable) element).click();
            } else {
                ((TextField) element).getText();
            }
        }


    }

/*    static void createNewElementFromCoords(){

        coordX.setText(Integer.toString(rand.nextInt(scene.MAX_X)));
        coordY.setText(Integer.toString(rand.nextInt(scene.MAX_Y)));
        addElementButton.click();
    }*/
}
