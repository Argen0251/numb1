package game.players;

import game.general.RPG_Game;

public class TrickyBastard extends Hero {
    public boolean invisibleUse;
    public boolean invisible;
    public TrickyBastard(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.TRICK);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        //TODO superpower

        invisible= RPG_Game.random.nextBoolean();
        if(invisible && !invisibleUse) {
            System.out.println("Loki invisible in this raund ");
            invisibleUse=false;

        }
        else if(invisibleUse) {
            invisibleUse=false;
        }

    }
}
