package me.duncte123;

import me.duncte123.entities.Monster;
import me.duncte123.entities.decorations.DoubleDamageDecorator;
import me.duncte123.entities.decorations.MonsterDecoratorBase;
import me.duncte123.entities.decorations.SteelArmourDecorator;

public class Main {
    public static void main(String[] args) {
        final Monster monster = new SteelArmourDecorator(
                new DoubleDamageDecorator(
                        new MonsterDecoratorBase(new Monster())
                )
        );

        System.out.println("Monster damage: " + monster.getDamage());
        System.out.println("Monster health: " + monster.getHealth());
        monster.takeDamage(10);
        System.out.println("Monster health: " + monster.getHealth());
    }
}
