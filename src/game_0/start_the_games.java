package game_0;

public class start_the_games {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setDamage(50);
    boss.setHealth(700);
    boss.setTypeDefence("Magic");
        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss TypeDefence: " + boss.getTypeDefence());

        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero's health "+heroes[i].getHealth()+"; Hero's damage "+heroes[i].getDamage()+ "; Hero's superpower "+ heroes[i].getSuperPower());
        }
        }
    public static Hero[] createHeroes() {
        Hero mage = new Hero(280,15, "magic");
        Hero kinetic = new Hero(240,10, "kinetik");
        Hero fighter = new Hero(300,20);
        Hero[] heroes = new Hero[]{mage, kinetic, fighter };
        return heroes;
    }
}
