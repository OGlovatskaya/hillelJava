package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public class Human extends Character {
    public Human() {
        setCuttingDamage(3);
    }

    @Override
    String display() {
        return "Human";
    }
}
