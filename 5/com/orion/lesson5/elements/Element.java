package com.orion.lesson5.elements;

public abstract class Element {

    private int x;
    private int y;
    private int height;
    private int weight;
    private String caption;
    private boolean state;

    public Element(int x, int y, int height, int weight, String caption, boolean state) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.weight = weight;
        this.caption = caption;
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
