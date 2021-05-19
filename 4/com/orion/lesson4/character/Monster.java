package com.orion.lesson4.character;

public class Monster extends Charm {

    private static final int DAMAGE = 5;
    private static final int HITPOINT = 8;

    public Monster(String name) {
        super("Монстр №" + name, HITPOINT);
    }

    public void setDamage(int damage) {
        //return getDamage();
    }

    @Override
    public void getDamage() {

        int damage = rand.nextInt(DAMAGE);

        for (Charm target: targets) {
            if(target != null && !this.equals(target)){
                System.out.println("Монстр" + this.getName() + " атакует " + target.getName() + " на " + damage + " единиц " +
                        "урона");
                target.setDamage(damage);
            }
        }
    }

    public boolean isDead(int damage) {
        return (this.getHitPoint() - damage) > 0;
    }
}
