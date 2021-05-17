package com.orion.lesson4.character;

import com.orion.lesson4.spell.Spell;

import java.util.List;

public class Mage extends Character {

    private static final int SPELL_COUNT = 3;
    private static final int MAX_SPELL_COUNT = 10;
    private static final int HITPOINT = 4;
    private List<Spell> spellBook;

    public Mage(String name) {
        super(name, HITPOINT);
        //this.spellBook = this.generateSpellBook(SPELL_COUNT);
    }

    public void getDamage(int damage) {

    }

    public int damage(Character target) {
        //spell
        return 1;
    }

    public boolean isDead() {
        return false;
    }

/*    private List generateSpellBook(int spellCount) {
        for (int i = 1; i <= spellCount; i++) {
            do{
                int spellNumber = rand.nextInt(MAX_SPELL_COUNT);
            }while (1 != 2);


        }
    }*/


}
