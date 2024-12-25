package game.players;

import game.general.RPG_Game;

public class Boss extends GameEntity {
    private SuperAbility defence;

    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void chooseDefence() {
        SuperAbility[] variants = SuperAbility.values();
        int randIndex = RPG_Game.random.nextInt(variants.length); // 0,1,2,3
        this.defence = variants[randIndex];
    }

    public SuperAbility getDefence() {
        return defence;
    }

    public void attack(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                if (hero instanceof Berserk &&
                        this.defence != SuperAbility.BLOCK_DAMAGE_AND_REVERT) {
                    int blocked = (RPG_Game.random.nextInt(2) + 1) * 5; // 5, 10
                    ((Berserk) hero).setBlockedDamage(blocked);
                    hero.setHealth(hero.getHealth() - (this.getDamage() - blocked));
                } else {
                    hero.setHealth(hero.getHealth() - this.getDamage());
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " defence: " + this.defence;
    }
}
