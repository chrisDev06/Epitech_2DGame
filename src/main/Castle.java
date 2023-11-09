package main;

public class Castle {
    private int durability;

    public Castle(int initialDurability) {
        this.durability = initialDurability;
    }

    public void takeDamage(int damage) {
        durability -= damage;
        if (durability < 0) durability = 0;
    }

    public boolean isDestroyed() {
        return durability <= 0;
    }

    public int getDurability() {
        return durability;
    }
}
