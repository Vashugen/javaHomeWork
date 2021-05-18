package com.orion.lesson4.character;

import java.util.Random;

abstract public class Charm {

    private String name;
    private int hitPoint;
    private int position;

    public Charm(String name, int hitPoint) {
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

    public abstract boolean isDead(int damage);

    public abstract int setDamage();

    public abstract void getDamage(int damage);

    public abstract boolean isDead();


}
