package game.players;

import game.general.RPG_Game;

public class TrickyBastard extends Hero {
    public boolean invisibleUsing;
    public boolean invisible;
    public TrickyBastard(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.TRICK);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        //TODO superpower
        invisible = RPG_Game.random.nextBoolean();
        if (invisible) {
            invisible = false;
            invisibleUsing = false;
        } else if (!invisibleUsing && RPG_Game.random.nextBoolean()) {
            invisible = true;
            invisibleUsing = true;
            System.out.println(getName() + " Loki simulates dead in next round! ");
        }
    }
}
