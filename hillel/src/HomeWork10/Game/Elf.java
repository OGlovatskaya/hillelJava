package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public class Elf extends Character {

    public Elf() {
        setDamage(new Damage(0, 0, 4));
    }

    @Override
    String display() {
        return "Elf";
    }
}
