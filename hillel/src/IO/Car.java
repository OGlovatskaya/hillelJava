package IO;

import java.io.Serializable;

/**
 * Created by OGlovatskaya on 23.11.2015.
 */
public class Car implements Serializable{
    private static final long serialVersionUID = -7512501727561008871L;
    String model;
    int year;
    CarOwner owner;
    String color;
    //transient CarOwner owner; //temporal, doesn't save by outputStream

    public Car(String model, int year, CarOwner owner, String color) {
        super();
        this.model = model;
        this.year = year;
        this.owner = owner;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                ", color='" + color + '\'' +
                '}';
    }
}
