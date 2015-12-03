package Generics;



/**
 * Created by OGlovatskaya on 03.12.2015.
 */
public class Manager extends Employee {

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void fire(Employee employee){
        System.out.println(employee.getName() + "fired!");
    }
}
