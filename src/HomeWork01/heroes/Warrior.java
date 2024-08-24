package HomeWork01.heroes;

import HomeWork01.enemies.Enemy;

public class Warrior extends Hero {
    public final int DAMAGE = 30;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин " + this.getName() + " атакует врага.");
        enemy.takeDamage(DAMAGE);
    }
}