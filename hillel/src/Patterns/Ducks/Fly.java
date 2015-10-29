package Patterns.Ducks;

/**
 * Created by OGlovatskaya on 29.10.2015.
 */
public class Fly implements FlyBehavior {
    @Override
    public String fly() {
        return "i'm fly";
    }
}
