package OOP;

/**
 * Created by OGlovatskaya on 12.10.2015.
 */
public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
