package me.duncte123.entities;

public class Monster {

    private int health = 100;

    public int getDamage() {
        return 5;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int points) {
        this.health -= points;
    }
}
