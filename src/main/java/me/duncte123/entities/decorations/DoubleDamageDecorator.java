package me.duncte123.entities.decorations;

public class DoubleDamageDecorator extends MonsterDecoratorBase {
    public DoubleDamageDecorator(MonsterDecoratorBase base) {
        super(base);
    }

    @Override
    public int getDamage() {
        return base.getDamage() * 2;
    }
}
