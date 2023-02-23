package me.duncte123.entities.decorations;

public class SteelArmourDecorator extends MonsterDecoratorBase {
    public SteelArmourDecorator(MonsterDecoratorBase base) {
        super(base);
    }

    @Override
    public void takeDamage(int points) {
        base.takeDamage(points / 2);
    }
}
