package OOP;

/**
 * Created by OGlovatskaya on 12.10.2015.
 */
public class AbstractZooExample {
    public static void main(String[] args){

        printSound(new Cat());
        //printSound(new Dog());

        Cat cat = new Cat();
        //Dog dog = new Dog();
        vaccinated(cat);
        //vaccinated(dog);

        Employee employee = new Employee();
        vaccinated(employee);

        System.out.println(cat); //=System.out.println(cat.toString());
        //System.out.println(dog.toString());
        System.out.println(employee);

        Employee employee1 = new Employee();
        Human human = employee1;
        Object object = human;
        Vaccinable vaccinable = employee1;

        human = new Human();
        //employee1 = (Employee) human;
        employee1.vaccinated("sdfr");

    }

    public static void vaccinated (Vaccinable animalOrEmployee){
        animalOrEmployee.vaccinated("ASD-1");
    }

    public static void printSound (Animal animal){
        System.out.println(animal.makeSound());
    }
}
