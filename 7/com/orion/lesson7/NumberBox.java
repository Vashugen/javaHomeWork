package com.orion.lesson7;

public class NumberBox <N extends Number> extends Box{

    public NumberBox(N content) {
        super(content);
    }

    /*public N add(N firt, N second){
        return firt + second;
    }*/

    public NumberBox<Number> multiply(Box anotherBox){

        return new NumberBox<>(123);
    }
}
