package com.orion.lesson4.character;

import java.util.Map;

public class Monster extends Charm {

    private static final int DAMAGE = 5;
    private static final int HITPOINT = 8;

    public Monster(String name) {
        super("Монстр №" + name, HITPOINT);
    }

    public void setDamage(int damage) {
        this.setHitPoint(this.getHitPoint() - damage);
    }

    @Override
    public void action(Map<Integer, Charm> targets) {

        if(this.getHitPoint() > 0){

            int damage = rand.nextInt(DAMAGE);

            do{

            }while ()

            Charm target = targets.forEach((k, v) -> {
                if(!this.equals(v)){
                    System.out.println(this.getName() + " атакует " + v.getName() + " на " + damage + " единиц " +
                            "урона");
                    v.setDamage(damage);
                    return v;
                }
            });

/*            do {

            }while(this.equals(targets))

            for (Charm target: targets) {
                if(target != null && !this.equals(target)){

                }
            }*/
        }
    }
}
