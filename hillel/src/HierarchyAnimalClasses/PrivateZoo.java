package HierarchyAnimalClasses;

/**
 * Created by user on 10.10.2015.
 */
public class PrivateZoo {
    public static void main(String[] args){

        Domestic cat = new Cat();
        cat.name = "Albert";
        System.out.println(cat.makeSound());

        Domestic dog = new Dog();
        dog.name = "George";
        System.out.println(dog.makeSound());

        Domestic hamster = new Hamster();
        hamster.name = "Ignat";
        System.out.println(hamster.makeSound());

        Domestic guedDog = new GuideDog(false);
        guedDog.name = "Marley";
        System.out.println(guedDog.makeSound());

        Domestic guedDog1 = new GuideDog(true);
        guedDog1.name = "Mozart";
        System.out.println(guedDog1.makeSound());

        Domestic fish = new Fish();
        fish.name = "Julia";
        System.out.println(fish.makeSound());

        Wild wolf = new Wolf(true);
        System.out.println(wolf.makeSound());

        Wild lion = new Lion(true);
        System.out.println(lion.makeSound());

        Wild giraffe = new Giraffe(false);
        System.out.println(giraffe.makeSound());

        Wild crocodile = new Crocodile(true);
        System.out.println(crocodile.makeSound());



    }
}
