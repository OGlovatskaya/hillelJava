package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public abstract class Weapon {
    private Damage damage;

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public int getCuttingDamage() {
        return damage.getCuttingDamage();
    }

    public int getCrushingDamage() {
        return damage.getCrushingDamage();
    }

    public int getPiercingDamage() {
        return damage.getPiercingDamage();
    }

    abstract String typeOfWeapon();
}
