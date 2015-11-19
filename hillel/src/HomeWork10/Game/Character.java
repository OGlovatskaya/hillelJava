package HomeWork10.Game;

/**
 * Created by user on 04.11.2015.
 */
public abstract class Character {
    Weapon weapon;

    public String typeOfWeapon(){
        return weapon.typeOfWeapon();
    }

    abstract String display();
}

