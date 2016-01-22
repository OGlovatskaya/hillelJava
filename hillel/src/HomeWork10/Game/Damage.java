package HomeWork10.Game;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by user on 27.12.2015.
 */
public class Damage implements Serializable {
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

    public int totalDamage() {
        int cut = this.getCuttingDamage();
        int crush = this.getCrushingDamage();
        int pierce = this.getPiercingDamage();

        int[] ints = {cut, crush, pierce};
        Arrays.sort(ints);
        int totalDamage = ints[2] + ints[1] / 2;

        return totalDamage;
    }

    public Damage plus(Damage otherDamage) {
        int cut = this.getCuttingDamage() + otherDamage.getCuttingDamage();
        int crush = this.getCrushingDamage() + otherDamage.getCrushingDamage();
        int pierce = this.getPiercingDamage() + otherDamage.getPiercingDamage();

        return new Damage(cut, crush, pierce);
    }
}
