package lesson_7;

public class warrior extends Hero {
    public warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }
    public void applySuperAbility() {
        System.out.println("warrior применил супер способность: " + getSuperAbility());
    }

}
