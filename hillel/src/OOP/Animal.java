package OOP;

import java.util.Arrays;

/**
 * Created by OGlovatskaya on 08.10.2015.
 */
public abstract class Animal implements Vaccinable{
    String name;
    int age;
    private String[] vaccines = new String[3];
    private int vaccineCounter = 0;


    public void vaccinated (String vaccinated) {
       vaccines[vaccineCounter] = vaccinated; //vaccines[vaccineCounter] = vaccinated;
        vaccineCounter++;
    }

    public String toString(){
        String result = "name: " + name;
        result += " age: " + age;
        result += " vaccines: " + Arrays.toString(vaccines);
        return result;
    }

    public abstract String makeSound();

 /*   public String makeSound(){
        return "noise";
    }
}*/

}
