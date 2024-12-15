package lesson1_2_3;

import java.util.Random;

public class Lesson_4_1 {

    public static int bossHealth = 1499;
    public static int bossDamage = 50;
    public static String bossDefence;
    public static int medicHealAmount = 50;

    public static int[] heroesHealth = {270, 260, 250, 300, 700, 240, 350, 280};
    public static int[] heroesDamage = {20, 15, 10, 0, 5, 10, 0, 25 };
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic", "Medic", "Golem", "Lucky", "Witcher", "Thor"};
    public static boolean witcherUsedAbility = false;
    public static boolean stun = false;
    public static int roundNumber;

    public static void main(String[] args) {
        printStatistics();

        while (!isGameOver()) {
            playRound();
        }
    }

    public static boolean isGameOver() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        /*if (heroesHealth[0] <= 0 && heroesHealth[1] <= 0 && heroesHealth[2] <= 0) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;*/
        boolean allHeroesDead = true;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
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

    public static void playRound() {
        roundNumber++;
        chooseBossDefence();
        medicHeal();
        if (!stun) {
            bossAttack();
        } else {
            System.out.println("Boss is stunned and skips this round!");
            stun = false;
        }
        witcherAbility();
        heroesAttack();
        printStatistics();
    }

    public static void chooseBossDefence() {
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length); // 0,1,2
        bossDefence = heroesAttackType[randomIndex];
    }
    public static void medicHeal() {
        if (heroesHealth[3] > 0) {
            for (int i = 0; i < heroesHealth.length; i++) {
                if (heroesHealth[i] > 0 && heroesHealth[i] < 100) {
                    heroesHealth[i] += medicHealAmount;
                    System.out.println("Medic healed " + heroesAttackType[i] + " + " + medicHealAmount);
                    break;
                }
            }
        }
    }
    public static void witcherAbility() {
        if (!witcherUsedAbility && heroesHealth[6] > 0){
            for (int i = 0; i < heroesHealth.length; i++) {
                if ( heroesHealth[i] <= 0 && i !=6 ) {
                    heroesHealth[i] = heroesHealth[6];
                    heroesHealth[6] = 0;
                    System.out.println("Witcher Ability Used on " +heroesAttackType[i]);
                    witcherUsedAbility = true;
                    break;
                }
            }
        }




    }
        public static void heroesAttack() {
            Random random = new Random();
            for (int i = 0; i < heroesDamage.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                int damage = heroesDamage[i];

                if (bossDefence == heroesAttackType[i]) {
                    int coef = random.nextInt(9) + 2; // 2,3,4,5,6,7,8,9,10
                    damage = heroesDamage[i] * coef;
                    System.out.println("Critical Damage: " + damage);
                }
                if (i == 7 && random.nextBoolean()) {
                    stun = true;
                    System.out.println("Thor stunned the boss!");
                }
                if (bossHealth - damage < 0) {
                    bossHealth = 0;
                } else {
                    bossHealth = bossHealth - damage;
                }
            }
        }
    }

    public static void bossAttack() {
        if (heroesHealth[4] > 0) {
        int GlDamage = bossDamage/5 * (heroesHealth.length - 1);
        heroesHealth[4] -= GlDamage;
        if (heroesHealth[4] < 0) {
            heroesHealth[4] = 0;
        }

        }
        Random random = new Random();
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                int damage = (heroesHealth[4]  > 0 )? bossDamage - (bossDamage/5) : bossDamage;

                if (heroesHealth[5] != i &&heroesHealth[i] - damage < 0) {
                    heroesHealth[i] = 0;}

                     else {
                        boolean lucky1 =(i == 5)&& random.nextBoolean();
                        if (lucky1) {
                        System.out.println("Lucky dodged");
                        continue;}
                        heroesHealth[i] = heroesHealth[i] - damage;

                }
            }
        }
    }

    public static void printStatistics() {
        System.out.println("ROUND: " + roundNumber + " ----------------");
        /*String defence;
        if (bossDefence == null) {
            defence = "No defence";
        } else {
            defence = bossDefence;
        }*/
        System.out.println("Boss health: " + bossHealth + " damage: " + bossDamage + " defence: "
                + (bossDefence == null ? "No defence" : bossDefence)); // ternary condition
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesAttackType[i] + " health: " + heroesHealth[i] + " damage: " + heroesDamage[i]);
        }
    }
}
