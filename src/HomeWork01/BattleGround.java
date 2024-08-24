package HomeWork01;

import HomeWork01.enemies.Enemy;
import HomeWork01.heroes.Archer;
import HomeWork01.heroes.Hero;
import HomeWork01.heroes.Mage;
import HomeWork01.heroes.Warrior;

import java.util.ArrayList;
import java.util.List;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(50);
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Archer("Дмитрий"));
        heroes.add(new Mage("Петр"));
        heroes.add(new Warrior("Лев"));
        for (Hero hero : heroes) {
            System.out.println("Здоровье врага: " + enemy.getHealth());
            if (enemy.isAlive()) hero.attackEnemy(enemy);
        }
        if (enemy.isAlive()) System.out.println("Враг жив! Здоровье:" + enemy.getHealth());
        else System.out.println("Враг убит! Здоровье:" + enemy.getHealth());
    }
}
