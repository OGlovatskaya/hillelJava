package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public interface Damage {
    void setCuttingDamage(int cuttingDamage);
    void setCrushingDamage(int crushingDamage);
    void setPiercingDamage(int piercingDamage);

    int getCuttingDamage();
    int getCrushingDamage();
    int getPiercingDamage();
}
