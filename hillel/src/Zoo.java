/**
 * Created by OGlovatskaya on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args){
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
