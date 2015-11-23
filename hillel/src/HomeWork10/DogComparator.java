package HomeWork10;

import OOP.Dog;

import java.util.Comparator;

/**
 * Created by user on 23.11.2015.
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.equals(o2)){
            return 0;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
