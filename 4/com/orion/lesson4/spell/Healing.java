package com.orion.lesson4.spell;

public class Healing extends Spell{

    private static int DAMAGE = -7;

    public Healing(String name) {
        super(name, DAMAGE);
    }

    @Override
    public void cast() {

    }
}
