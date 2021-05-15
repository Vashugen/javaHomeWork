package com.orion.lesson4.character;

public class Monster extends Character {

    private static final int DAMAGE = 5;

    public Monster(String name, int hitPoint) {
        super(name, hitPoint);
    }

    public void getDamage(int damage){

        if(this.isDead()){

        }

    }

    public int damage(Character target){

        int damage = rand.nextInt(DAMAGE);

        System.out.println("Монстр" + this.getName() + " атакует " + target.getName() + " на " + damage + " единиц " +
                "урона");

        return damage;

    }

    public boolean isDead(){
        if(true){

        }
        return false;
    }

}
