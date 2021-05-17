package com.orion.lesson4.character;

import com.orion.lesson4.spell.Spell;
import com.orion.lesson4.spell.SpellCollection;

import java.util.*;

public class Mage extends Charm {

    private static final int MAX_SPELL_COUNT = 2;
    private static final int HITPOINT = 4;
    private ArrayList<Spell> spellBook = new ArrayList<>();

    public Mage(String name) {
        super("Маг №" + name, HITPOINT);
        generateSpellBook();
    }

    public void getDamage(int damage) {

    }

    public int damage(Charm target) {
        //spell
        return 1;
    }

    public boolean isDead() {
        return false;
    }

    private void generateSpellBook() {

        Random rand = new Random();
        int spellCount = rand.nextInt();

        for (int i = 0; i <= MAX_SPELL_COUNT; i++) {
            do {
                spellCount = rand.nextInt(SpellCollection.values().length - 1);
            }while (spellBook.indexOf(SpellCollection.values()[spellCount].action()) != -1);

            spellBook.add(SpellCollection.values()[spellCount].action());
        }
    }

}
