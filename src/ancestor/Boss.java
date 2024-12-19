package ancestor;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType type, String name) {
        this.weapon = new Weapon(type, name);
    }


    public void info(){
        System.out.println("***Boss Info: ");
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println(" Type: " + getType());
        System.out.println("Weapon: " + weapon.getType() + "; damage of weapon: +" + weapon.getType().getDamage());
        System.out.println(" Weapon name: "+weapon.getName());
    }

}
