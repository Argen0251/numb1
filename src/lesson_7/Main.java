package lesson_7;

public class Main {
    public static void main(String[] args) {
        Hero heroes[]={
        new magic(220, 25, "Fireball"),
        new medic(250, 0, "Healing", 20),
        new warrior(240, 30, "Critical Damage")
    };
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();

            if (heroes[i] instanceof medic) {
                medic medic = (medic) heroes[i];
                int totalHealed = 0;
                for (int j = 0; j < heroes.length; j++) {
                    if (!(heroes[j] instanceof medic)) {
                        medic.heal(heroes[j]);
                        totalHealed += medic.getHealPoints();
                    }
                }
                medic.increaseExperience(totalHealed);
                System.out.println("Опыт медика: " + medic.getHealPoints());
            }

        }
        System.out.println();
        System.out.println("Здоровье героев после лечения:");
        System.out.println(" Magic здоровье: " + heroes[0].getHealth());
        System.out.println(" Medic здоровье: " + heroes[1].getHealth());
        System.out.println(" Warrior здоровье: " + heroes[2].getHealth());
    }
}
