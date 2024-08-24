package HomeWork01;

import HomeWork01.enemies.Enemy;
import HomeWork01.heroes.Archer;
import HomeWork01.heroes.Mage;
import HomeWork01.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        Warrior warrior = new Warrior("Дмитрий");
        warrior.attackEnemy(enemy);
        Mage mage = new Mage("Петр");
        mage.attackEnemy(enemy);
        Archer archer = new Archer("Лев");
        archer.attackEnemy(enemy);
    }
}
