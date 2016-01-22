package HomeWork10.Game;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by user on 27.12.2015.
 */
public class Damage implements Serializable{
    private int cuttingDamage;
    private int crushingDamage;
    private int piercingDamage;
    private Character character;

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

    public void setCharacter(Character character){
        this.character = character;
    }

    public int totalDamage() {
        int cut = character.getDamage().getCuttingDamage() + character.getWeapon().getDamage().getCuttingDamage();
        int crush = character.getDamage().getCrushingDamage() + character.getWeapon().getDamage().getCrushingDamage();
        int pierce = character.getDamage().getPiercingDamage() + character.getWeapon().getDamage().getPiercingDamage();

        int[] ints = {cut, crush, pierce};
        Arrays.sort(ints);
        int totalDamage = ints[2] + ints[1] / 2;

        return totalDamage;
    }
}
