package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public class Orc extends Character {
    public Orc() {
        setDamage(new Damage(0, 2, 0));
    }

    @Override
    String display() {
        return "Ocr";
    }
}
