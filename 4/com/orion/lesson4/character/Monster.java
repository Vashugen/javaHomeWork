package com.orion.lesson4.character;

public class Monster extends Charm {

    private static final int DAMAGE = 5;
    private static final int HITPOINT = 8;

    public Monster(String name) {
        super("Монстр №" + name, HITPOINT);
    }

    public void getDamage(int damage){

        if(this.isDead()){

        }

    }

    public int damage(Charm target){

/*        int damage = rand.nextInt(DAMAGE);

        System.out.println("Монстр" + this.getName() + " атакует " + target.getName() + " на " + damage + " единиц " +
                "урона");

        return damage;*/
        return 1;

    }

    public boolean isDead(){
        if(true){

        }
        return false;
    }

}
