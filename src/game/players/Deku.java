package game.players;

import game.general.RPG_Game;

public class Deku extends Hero{
    public Deku(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.STRENGTH_OF_DEKU );
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int baseDamage = getDamage();
        int baseHealth = getHealth();

        // Шанс 50% на изменение силы удара
        boolean powerChange = RPG_Game.random.nextBoolean();
        if (powerChange) {
            int chance = RPG_Game.random.nextInt(3) ;
            double damage_deku;
            int healthLoss;

            switch (chance) {
                case 0:
                    damage_deku = 1.2;
                    healthLoss = 10;
                    break;
                case 1:
                    damage_deku = 1.5;
                    healthLoss = 20;
                    break;
                case 2:
                    damage_deku = 2.0;
                    healthLoss = 30;
                    break;
                default:
                    damage_deku = 1.0;
                    healthLoss = 0;
            }

            setDamage((int) (baseDamage * damage_deku));
            setHealth(baseHealth - healthLoss);

            System.out.println(getName() + " Deku boost his damage " + (int) ((damage_deku - 1) * 100) + "%, but lost " + healthLoss + " health!");

            boss.setHealth(boss.getHealth() - getDamage());
            System.out.println(getName() + " Deku attack boss  " + getDamage() + " damage!");
        }

        setDamage(baseDamage);
    }
}

