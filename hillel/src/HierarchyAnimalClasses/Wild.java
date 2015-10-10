package HierarchyAnimalClasses;

/**
 * Created by user on 10.10.2015.
 */
public class Wild extends Animal {
    public boolean isPredator;

    @Override
    public String makeSound() {
        return "noise";
    }
}

