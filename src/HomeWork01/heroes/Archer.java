package HomeWork01.heroes;

import HomeWork01.enemies.Enemy;

public class Archer extends Hero {
    public final int DAMAGE = 10;

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + this.getName() + " атакует врага.");
        enemy.takeDamage(DAMAGE);
    }
}