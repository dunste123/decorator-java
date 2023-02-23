package me.duncte123.entities.decorations;

import me.duncte123.entities.Monster;

public class MonsterDecoratorBase extends Monster {

    protected final Monster base;

    public MonsterDecoratorBase(Monster base) {
        this.base = base;
    }

    @Override
    public int getDamage() {
        return base.getDamage();
    }

    @Override
    public int getHealth() {
        return base.getHealth();
    }

    @Override
    public void takeDamage(int points) {
        base.takeDamage(points);
    }
}
