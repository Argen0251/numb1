package lesson_7;

public class magic extends Hero {
    public magic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }
    public void applySuperAbility() {
        System.out.println("magic применил супер способность: " + getSuperAbility());
    }

}
