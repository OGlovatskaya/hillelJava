package HomeWork5;

import HomeWork5.Domestic;

/**
 * Created by user on 10.10.2015.
 */
public class GuideDog extends Domestic {

        public boolean isTrained;

        public GuideDog (boolean isTrained){
            this.isTrained = isTrained;
        }

        public boolean getHome(){
            if (isTrained){
                return true;
            }else return false;
        }

        @Override
        public String makeSound() {
            if (getHome()){
                return "Hello, my name is " + name + ". I can take you home.";
            } else return "Hello, my name is " + name + ".";

        }
    }
