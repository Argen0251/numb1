package game.players;

import game.general.RPG_Game;

public class Ludaman extends Hero {
    private int numb1;
    private int numb2;
    public int summLudo= numb1+numb2;
    public boolean lucky = false;
    public int[] numb3={ 100, 200};
    public Ludaman(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.Ludom);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int numb1 =RPG_Game.random.nextInt(2)+98;
        int numb2 =RPG_Game.random.nextInt(2)+98;
        if (numb1==numb2) {
            summLudo=numb1+numb2;
            boss.setHealth(boss.getHealth()-summLudo);
            System.out.println("Ludaman attacked boss in "+summLudo);
        }
        else{
            summLudo = (numb1+numb2);
            int rand=RPG_Game.random.nextInt(2);
            heroes[rand].setHealth(heroes[rand].getHealth()-summLudo);
            System.out.println("Ludaman attacked hero in " + heroes[rand].getName() +" " + (summLudo));
        }
        }
    }



