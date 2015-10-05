/**
 * Created by OGlovatskaya on 05.10.2015.
 */
public class Cat {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    int age;
    String name;
    String color;
    
    public Cat(){
        System.out.println("in cat's constructor");
    }


    public Cat(boolean isPet, int age, String name, String color){
        pet = isPet; //mojno bez this, esli pereimenovat'
        this.age = age;
        this.name = name;
        this.color = color;

    }
}
