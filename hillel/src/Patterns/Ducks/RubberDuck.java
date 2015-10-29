package Patterns.Ducks;

/**
 * Created by OGlovatskaya on 26.10.2015.
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squack();
    }

    @Override
    String display() {
        return "rubber duck";
    }
}
