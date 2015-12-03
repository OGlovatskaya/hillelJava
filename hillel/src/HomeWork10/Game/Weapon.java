package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public abstract class Weapon implements Damage{
    private int cuttingDamage;
    private int crushingDamage;
    private int piercingDamage;

    @Override
    public void setCuttingDamage(int cuttingDamage) {
        this.cuttingDamage = cuttingDamage;
    }

    @Override
    public void setCrushingDamage(int crushingDamage) {
        this.crushingDamage = crushingDamage;
    }

    @Override
    public void setPiercingDamage(int piercingDamage) {
        this.piercingDamage = piercingDamage;
    }

    @Override
    public int getCuttingDamage() {
        return this.cuttingDamage;
    }

    @Override
    public int getCrushingDamage() {
        return this.crushingDamage;
    }

    @Override
    public int getPiercingDamage() {
        return this.piercingDamage;
    }

    abstract String typeOfWeapon();
}
