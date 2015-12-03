package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public class Sword extends Weapon {
    public Sword() {
        int cut = (int) (6 + (Math.random() * 4));
        setCuttingDamage(cut);
    }

    @Override
    String typeOfWeapon() {
        return "Sword";
    }
}
