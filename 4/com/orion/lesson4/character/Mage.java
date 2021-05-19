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

    public void setDamage(int damage) {
        this.setHitPoint(damage);

    }

    public void getDamage(Charm[] targets) {

    }

    public boolean isDead(int damage) {
        return (this.getHitPoint() - damage) > 0;
    }

    private void generateSpellBook() {

        ArrayList<SpellCollection> spells = new ArrayList<SpellCollection>(Arrays.asList(SpellCollection.values()));
        Random rand = new Random();
        int spellCount;

        while (spells.size() > 0 && spellBook.size() <= MAX_SPELL_COUNT) {
            //WHY not -1
            spellCount = spells.isEmpty() ? 0 : rand.nextInt(spells.size());
            spellBook.add(spells.remove(spellCount).action());
        }
    }

}
