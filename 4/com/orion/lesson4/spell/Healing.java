package com.orion.lesson4.spell;

public class Healing extends Spell{


    public static int DAMAGE = -7;

    public Healing(String name) {
        super(name, DAMAGE);
        //this.setNumberInSpellBook(1);
    }

    @Override
    public void cast() {

    }
}
