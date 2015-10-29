package Patterns.Ducks;

/**
 * Created by OGlovatskaya on 29.10.2015.
 */
public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "Quack";
    }
}
