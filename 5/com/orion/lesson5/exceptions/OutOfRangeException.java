package com.orion.lesson5.exceptions;

import com.orion.lesson5.elements.Element;

public class OutOfRangeException extends Exception {

    public OutOfRangeException(Element newElement, Element existsElement) {
        super("Элемент \"" + newElement.getCaption() +  "\" пересекается с элементом \"" + existsElement.getCaption() + "\" . Добавление невозможно!");
    }
}
