package HomeWork01.heroes;

import HomeWork01.enemies.Enemy;

public class Mage extends Hero {
    public final int DAMAGE = 20;

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг " + this.getName() + " атакует врага.");
        enemy.takeDamage(DAMAGE);
    }
}