package com.orion.lesson4.spell;


public enum SpellCollection {

    HEALING {
        public Healing action() {
            return new Healing("Лечение");
        }
    },
    LIGHTING {
        public Lighting action(){
            return new Lighting("Молния");
        }
    };

    public abstract Spell action();

}
