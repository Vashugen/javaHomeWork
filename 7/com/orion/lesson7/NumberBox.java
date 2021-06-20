package com.orion.lesson7;

public class NumberBox <N extends Number> extends Box{
    
    private N content;

    public NumberBox(N content) {
        super(content);
    }

    //TODO ?NumberBox<N>
    public static <N extends Number> NumberBox of(N content){
        return new NumberBox<N>(content);
    }

    public NumberBox add(Box <? extends Number> anotherBox){
        return NumberBox.of(anotherBox.getContent().doubleValue() + content.doubleValue());
    }

    public NumberBox<Number> multiply(Box <? extends Number> anotherBox){
        return NumberBox.of(anotherBox.getContent().doubleValue() * content.doubleValue());
    }

}
