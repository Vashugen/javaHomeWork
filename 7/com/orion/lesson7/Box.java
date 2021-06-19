package com.orion.lesson7;

public class Box <T> {

    private T box;

    public Box(T box) {
        if(box == null){
            throw new NullPointerException("Box can't be null");
        }
        this.box = box;
    }

    public T getBox() {
        return box;
    }
}
