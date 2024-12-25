package game.players;

import game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coef = RPG_Game.random.nextInt(3) + 2; // 2,3,4
        boss.setHealth(boss.getHealth() - coef * this.getDamage());
        System.out.println("Warrior " + super.getName()
                + " has hit critically " + coef * this.getDamage());
    }
}
