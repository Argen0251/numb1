package game.general;

import game.players.*;

import java.util.Random;

public class RPG_Game {

    public static Random random = new Random();
    private static int roundNumber;

    public static void startGame() {
        Boss boss = new Boss("Dragon", 1000, 50);
        Warrior warrior1 = new Warrior("Alex", 280, 10);
        Warrior warrior2 = new Warrior("Arthur", 270, 15);
        Magic magic = new Magic("Harry", 290, 10);
        Berserk berserk = new Berserk("Vatar", 260, 15);
        Medic doc = new Medic("Old", 250, 5, 15);
        Medic assistant = new Medic("Yan", 300, 5, 5);
        TrickyBastard Loki = new TrickyBastard("Loki", 250, 10);
        Ludaman ludo = new Ludaman("ludo",300, 0);
        Hero[] heroes = {magic, doc, warrior2, warrior1, berserk, assistant, Loki, ludo};

        printStatistics(boss, heroes);

        while (!isGameOver(boss, heroes)) {
            playRound(boss, heroes);
        }
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("ROUND: " + roundNumber + " -------------");
        System.out.println(boss);
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    private static void playRound(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence();
        boss.attack(heroes);
        for (Hero hero : heroes) {
            if (hero instanceof Magic && roundNumber < 4&& boss.getDefence() != hero.getAbility()) {
                hero.setDamage(hero.getFirst_Damage());
                hero.applySuperPower(boss, heroes);
                break;
            }
        }
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && boss.getHealth() > 0
                    && boss.getDefence() != hero.getAbility()) {
                if (hero instanceof TrickyBastard && ((TrickyBastard) hero).invisible){
                    continue;}

                hero.attack(boss);
                if (!(hero instanceof Magic)) {
                    hero.applySuperPower(boss, heroes);
                }
            }
        }

        printStatistics(boss, heroes);
    }

    private static boolean isGameOver(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }
}
