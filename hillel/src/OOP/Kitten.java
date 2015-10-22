package OOP;

/**
 * Created by OGlovatskaya on 22.10.2015.
 */
public class Kitten extends Cat {

    public Kitten(boolean isPet, int age, String name, String color) {
        super(isPet, age, name, color);
    }

    @Override
    public String toString() {
        return "Kitten{ " + super.toString() + "}";
    }
}
