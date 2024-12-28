package game.players;

import game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        // TODO Here will be implementation of BOOSTING
        int boost = 4;
        if (boost > 0) {

            int coeff = RPG_Game.random.nextInt(3) + 2;// лучше здесь оставить рандом, так легче считать
            for (Hero hero : heroes) {
                if (hero.getHealth() > 0) {
                    int boostA = (hero.getFirst_Damage()*coeff);
                    hero.setDamage(boostA);
                    System.out.println("Маг увеличил урон для: " + hero.getName() + " на " + coeff);
                }
            }
            boost--;
        }
    }
    public void resetBoostedDamage(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setDamage(hero.getFirst_Damage());
            }
        }
    }
}
