package game.players;

public abstract class Hero extends GameEntity {
    private SuperAbility ability;
    private final int first_Damage;
    public Hero(String name, int health, int damage, SuperAbility ability) {
        super(name, health, damage);
        this.ability = ability;
        this.first_Damage = damage;
    }

    public final int getFirst_Damage() {
        return first_Damage;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }

    public abstract void applySuperPower(Boss boss, Hero[] heroes);
}
