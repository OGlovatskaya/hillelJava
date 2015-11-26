package HomeWork10.Game;

/**
 * Created by user on 04.11.2015.
 */
public abstract class Character {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String display(){
        return weapon.typeOfWeapon();
    }
}

