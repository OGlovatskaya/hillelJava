package HomeWork10.Game;

import java.io.Serializable;

/**
 * Created by user on 27.12.2015.
 */
public class Damage implements Serializable{
    private int cuttingDamage;
    private int crushingDamage;
    private int piercingDamage;

    public Damage(int cuttingDamage, int crushingDamage, int piercingDamage) {
        this.cuttingDamage = cuttingDamage;
        this.crushingDamage = crushingDamage;
        this.piercingDamage = piercingDamage;
    }

    public int getCuttingDamage() {
        return cuttingDamage;
    }

    public int getCrushingDamage() {
        return crushingDamage;
    }

    public int getPiercingDamage() {
        return piercingDamage;
    }
}
