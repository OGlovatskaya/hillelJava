package Patterns.Ducks;

/**
 * Created by OGlovatskaya on 26.10.2015.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    @Override
    public String display(){
        return "mallard duck";
    }
}
