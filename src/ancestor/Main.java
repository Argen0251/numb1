package ancestor;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setType("physical");
        boss.setWeapon(WeaponType.SPEAR, "Crimson");
        boss.info();
        System.out.println(" ");
        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(750);
        skeleton.setDamage(40);
        skeleton.setType("Magic");
        skeleton.setWeapon(WeaponType.BOW, "Breath of Death");
        skeleton.setArrows(80);
        skeleton.info();
        System.out.println(" ");
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(800);
        skeleton2.setDamage(35);
        skeleton2.setType("Lich");
        skeleton2.setWeapon(WeaponType.SWORD, "Abyssal Blade");
        skeleton2.setArrows(15);
        skeleton2.info();


    }
}
