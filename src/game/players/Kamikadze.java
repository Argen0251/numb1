package game.players;

import game.general.RPG_Game;

public class Kamikadze extends Hero{
    public Kamikadze(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.KAMIKADZE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int baseHealth = getHealth();
        boolean sniper = RPG_Game.random.nextBoolean();
        if (sniper) {
            boss.setHealth(boss.getHealth() - baseHealth);
            System.out.println(getName() + " japon die and attack boss with his health " + baseHealth + " damage!");
            setHealth(0);
        } else {
            int damage = baseHealth / 2;
            boss.setHealth(boss.getHealth() - damage);
            System.out.println(getName() + " japon miss the target and attack " + damage + " damage!");
            setHealth(0);
        }
    }
}
