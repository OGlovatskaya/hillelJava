package HierarchyAnimalClasses;

/**
 * Created by user on 10.10.2015.
 */
public class Domestic extends Animal{
    String name;
    boolean isVaccinated;

    @Override
    public String makeSound() {
        return "noise";
    }

}
