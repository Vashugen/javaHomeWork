package com.orion.lesson4.spell;

abstract public class Spell {

    //TODO type - заклинания могут быть не только на демаги - action вместо getDamage
    public String name;
    public int damage;
    private int numberInSpellBook;

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

    public int getNumberInSpellBook() {
        return numberInSpellBook;
    }

    public void setNumberInSpellBook(int numberInSpellBook) {
        this.numberInSpellBook = numberInSpellBook;
    }

    abstract public void cast();

}
