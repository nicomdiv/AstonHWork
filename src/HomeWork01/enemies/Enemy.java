package HomeWork01.enemies;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        setHealth(health);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}