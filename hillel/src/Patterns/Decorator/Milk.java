package Patterns.Decorator;

/**
 * Created by OGlovatskaya on 12.11.2015.
 */
public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
        setCost(5);
        setDescription(" Milk");
    }
}