package com.orion.lesson4.spell;

public class Lighting extends Spell{


    public static int DAMAGE = 7;

    public Lighting(String name) {
        super(name, DAMAGE);
        //this.setNumberInSpellBook(1);
    }

    @Override
    public void cast() {

    }
}
