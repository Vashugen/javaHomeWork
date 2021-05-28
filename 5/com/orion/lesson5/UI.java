package com.orion.lesson5;

import com.orion.lesson5.elements.Element;
import com.orion.lesson5.exceptions.OutOfRangeException;

import java.util.ArrayList;
import java.util.List;

public class UI {

    //TODO rename, this is coords
    public static int MAX_X = 100;
    public static int MAX_Y = 100;

    public static List<Element> elementList = new ArrayList<>();

    public List<Element> getAllElements(){
        return this.elementList;
    }

    public void addElement(Element element) throws OutOfRangeException {

        Element existsElement = allowToAdd(element.getX(), element.getY());

        if(existsElement != null) {
            throw new OutOfRangeException(element, existsElement);
        }

        this.elementList.add(element);

    }

    private Element allowToAdd(int x, int y){

        //TODO in callback + in 1 string
        for (Element item: elementList){
            if(item.getX() == x && item.getY() == y){
                return item;
            }
        }

        return null;

    }

}
