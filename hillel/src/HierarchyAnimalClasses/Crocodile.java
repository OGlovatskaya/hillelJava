package HierarchyAnimalClasses;

/**
 * Created by user on 10.10.2015.
 */
public class Crocodile extends Wild{
    public Crocodile (boolean isPredator){
        this.isPredator = isPredator;
    }

    @Override
    public String makeSound(){
        if (isPredator = true){
            return "Hello, I am a wild animal and I am angry";
        }else return "Hello, I am a wild animal.";
    }
}
