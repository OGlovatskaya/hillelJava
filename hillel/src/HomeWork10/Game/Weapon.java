package HomeWork10.Game;

import java.io.Serializable;

/**
 * Created by user on 01.12.2015.
 */
public abstract class Weapon implements Serializable{
    private Damage damage;

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public Damage getDamage(){
        return this.damage;
    }

    abstract String typeOfWeapon();
}
