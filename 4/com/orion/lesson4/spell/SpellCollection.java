package com.orion.lesson4.spell;


import java.util.ArrayList;

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
    },
    CHAIN_LIGHTING {
        public ChainLighting action(){
            return new ChainLighting("Цепная молния");
        }
    },
    WALL_OF_FIRE {
        public ChainLighting action(){
            return new ChainLighting("Цепная молния");
        }
    }
    ;

    public abstract Spell action();


}
