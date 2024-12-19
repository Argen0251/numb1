package ancestor;

public enum WeaponType {
    SWORD(45),
    SPEAR(35),
    BOW(30);
    private int domage;
    WeaponType(int domage) {
        this.domage = domage;
    }
    public int getDamage() {
        return this.domage;
    }
}
