package Patterns.Ducks;

/**
 * Created by OGlovatskaya on 26.10.2015.
 */
public class RubberDuck extends Duck{
    @Override
    String display() {
        return "rubber duck";
    }

    @Override
    public String fly() {
        return "fly no way :(";
    }

    @Override
    public String quack() {
        return "squack";
    }
}
