package Patterns.Decorator;

/**
 * Created by OGlovatskaya on 12.11.2015.
 */
public class Cream extends BeverageDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
        setCost(8);
        setDescription(" Cream");
    }
}
