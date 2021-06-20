package com.orion.lesson7;

public class Box <T> {

    private T content;

    public Box(T content) {
        if(content == null){
            throw new NullPointerException("Box can't be null");
        }
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
