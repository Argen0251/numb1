package game.players;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - blockedDamage);
        System.out.println("Berserk " + super.getName()
                + " has reverted " + blockedDamage);
    }
}
