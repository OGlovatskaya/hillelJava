package java8features;

/**
 * Created by OGlovatskaya on 14.01.2016.
 */
@FunctionalInterface
public interface Filtrator {
    boolean test(Apple apple);
}
