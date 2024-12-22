package lesson_7;

public class medic extends Hero {
    private int healPoints;

    public medic(int health, int damage, String superAbility, int healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }
    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
    public void increaseExperience(int totalHealed) {
        healPoints += totalHealed;
    }
    public void heal(Hero hero_n) {
        int healAmount = getHealPoints();
        hero_n.setHealth(hero_n.getHealth() + healAmount);
        System.out.println("medic вылечил героя на " + healAmount + " единиц здоровья.");
    }

    public void applySuperAbility() {
        System.out.println("medic применил супер способность: " + getSuperAbility());
    }
}
