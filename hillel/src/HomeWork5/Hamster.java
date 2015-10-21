package HomeWork5;

import HomeWork5.Domestic;

/**
 * Created by user on 10.10.2015.
 */
public class Hamster extends Domestic {

    @Override
    public String makeSound() {
        return "Hello, my name is " + name + ".";
    }
}
