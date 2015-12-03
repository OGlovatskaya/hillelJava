package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public class Bow extends Weapon {

    public Bow() {
        int pierce = (int)(5 + (Math.random() * 6));
        setPiercingDamage(pierce);
    }

    @Override
    String typeOfWeapon() {
        return "Bow";
    }
}
