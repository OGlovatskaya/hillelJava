package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public class Hammer extends Weapon {

    public Hammer() {
        int crush = (int) (7 + (Math.random() * 2));
        setDamage(new Damage(0, crush, 0));
    }

    @Override
    String typeOfWeapon() {
        return "Hammer";
    }
}
