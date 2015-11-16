package HomeWork5.Animals;

import HomeWork5.Animals.Domestic;

/**
 * Created by user on 10.10.2015.
 */
public class Dog extends Domestic {

    @Override
    public String makeSound() {
        return "Hello, my name is " + name + ". Woof.";
    }

}
