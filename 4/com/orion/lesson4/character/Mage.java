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

        ArrayList<SpellCollection> spells = new ArrayList<>(SpellCollection.values());
        Random rand = new Random();
        int spellCount = rand.nextInt();

        while (spells.size() > 0 && spellBook.size() <= MAX_SPELL_COUNT) {
            spellCount = spells.isEmpty() ? 0 : rand.nextInt(spells.size() - 1);
            spellBook.add(spells.remove(spellCount).action());
        }
    }

}
