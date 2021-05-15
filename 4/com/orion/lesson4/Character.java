package com.orion.lesson4;

import java.util.Random;

abstract public class Character {

    private String name;
    private int hitPoint;
    Random rand = new Random();

    public Character(String name, int hitPoint) {
        this.name = name;
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public abstract void getDamage(int damage);

    public abstract int damage(Character target);

    public abstract boolean isDead();


}
