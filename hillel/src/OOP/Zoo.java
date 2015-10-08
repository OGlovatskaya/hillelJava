package OOP;

/**
 * Created by OGlovatskaya on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args){
        Cat cat = new Cat();

        String sound = cat.makeSound();
        System.out.println(sound);


        //equalsExample();
        //referenceComparison();
        //catCreation();
    }

    private static void equalsExample() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "Blue-gray");

        System.out.println(tomCat1.equals(tomCat2));
    }

    private static void referenceComparison() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "Blue-gray");

        System.out.println(tomCat1 == tomCat2);

        tomCat1 = tomCat2;

        System.out.println(tomCat1 == tomCat2);
    }

    private static void catCreation() {
        if (Cat.domestic){
            System.out.println("Cat is domestic animal");
        }
        if (Cat.predator){
            System.out.println("Cat is predator");
        }

        Cat tomCat = new Cat(true, 3, "Tom", "Blue-gray");

        Cat mursik = new Cat(true, 4, "Myrsik", "Black");

        Cat cat = new Cat();
        System.out.println("Cat's name " + cat.name);
        System.out.println("Cat is pet " + cat.pet);

        System.out.println(tomCat.name);
        System.out.println(mursik.age);
        System.out.println(mursik.predator);
    }
}
