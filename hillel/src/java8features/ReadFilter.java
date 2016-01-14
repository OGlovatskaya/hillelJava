package java8features;

/**
 * Created by OGlovatskaya on 14.01.2016.
 */
public class ReadFilter implements Filtrator {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("Red");
    }
}
