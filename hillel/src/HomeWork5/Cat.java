package HomeWork5;

/**
 * Created by user on 10.10.2015.
 */
public class Cat extends Domestic {

    @Override
    public String makeSound() {
        return "Hello, my name is " + name + ". Meow.";
    }
}
