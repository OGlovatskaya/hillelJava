package OOP;

import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * Created by OGlovatskaya on 08.10.2015.
 */
public class Cat extends Animal implements Comparable<Cat>{
    public static final boolean domestic = true;
    public static final boolean predator = true;

    public String someField = "Cat's field";
    boolean pet;
    String color;

    public Cat(){
        super("unknown", 0);
        System.out.println("in cat's constructor");
    }

    public Cat(boolean isPet, int age, String name, String color){
        super(name,age);
        pet = isPet; //mojno bez "this", esli pereimenovat'
        //this.age = age;
        //this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals(Object otherObject){
        System.out.println("in cat's equals method");

        if (!super.equals(otherObject)) return false;
        if (!(otherObject instanceof  Cat)) return false;

        Cat otherCat = (Cat) otherObject;

        if (pet != otherCat.pet) return false;
        if (!color.equals(otherCat.color)) return false;
        return true;
    }

    @Override
    public String makeSound(){
        return "Meow";
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Cat{" +
                "pet=" + pet +
                ", color='" + color + '\'' +
                '}';
        return result;
    }

    public String getSomeField() {
        return someField;
    }

    public static String getTypeName() {
        return "Cat";
    }


    @Override
    public int compareTo(Cat o) {
        return this.getName().compareTo(o.getName());
    }
}
