package HomeWork5;

import HomeWork5.Wild;

/**
 * Created by user on 10.10.2015.
 */
public class Wolf extends Wild {

    public Wolf(boolean isPredator){
        this.isPredator = isPredator;
    }

    @Override
    public String makeSound(){
        if (isPredator = true){
            return "Hello, I am a wild animal and I am angry.";
        }else return "Hello, I am a wild animal.";
    }
}
