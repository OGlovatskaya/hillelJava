package Patterns.Ducks;

/**
 * Created by OGlovatskaya on 26.10.2015.
 */
public class Lake {
    public static void main(String[] args){
        test(new RubberDuck());
        test(new MallardDuck());
        test(new Decoy());

        System.out.println("test jet engine");
        Duck pilot = new RubberDuck();
        test(pilot);

        pilot.flyBehavior = new Jet();
        test(pilot);

    }

    private static void test(Duck duck) {
        System.out.println(duck.quack());
        System.out.println(duck.fly());
        System.out.println(duck.display());
        System.out.println();
    }
}
