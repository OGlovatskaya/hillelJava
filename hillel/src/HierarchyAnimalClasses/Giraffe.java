package HierarchyAnimalClasses;

/**
 * Created by user on 10.10.2015.
 */
public class Giraffe extends Wild {

    public Giraffe (boolean isPredator){
        this.isPredator = isPredator;
    }

    @Override
    public String makeSound(){
        if (!isPredator){
            return "Hello, I am a wild animal.";
        }else return "Hello, I am a wild animal and I am angry";
    }
}
