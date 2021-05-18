package com.orion.lesson4.spell;

abstract public class Spell {

    //TODO type - заклинания могут быть не только на демаги - action вместо getDamage
    private String name;
    private int damage;

    public Spell(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    abstract public void cast();

}
