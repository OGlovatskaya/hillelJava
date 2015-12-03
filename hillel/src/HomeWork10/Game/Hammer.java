package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public class Hammer extends Weapon {

    public Hammer() {
        int crush = (int) (7 + (Math.random() * 2));
        setCrushingDamage(crush);
    }

    @Override
    String typeOfWeapon() {
        return "Hammer";
    }
}
