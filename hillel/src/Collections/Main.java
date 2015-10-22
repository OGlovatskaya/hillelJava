package Collections;

import OOP.Cat;
import OOP.OOP;
import OOP.Kitten;

import java.util.*;

/**
 * Created by OGlovatskaya on 22.10.2015.
 */
public class Main {
    public static void main(String[] args){
        Collection<Cat> cats = new LinkedList<>();

        cats.add(new Cat(false, 10, "tom", "black"));

        someMethod(cats);

        //System.out.println(cats.get(0));

        //Set<Cat> catSet = new TreeSet<>();
        //Collection<Cat> catSet = new TreeSet<>();
        //Collection<Cat> catSet = new ArrayList<>();
        Collection<Cat> catCollection = new ArrayList<>();
        catCollection.add(new Cat(false, 10, "Tom", "black"));
        catCollection.add(new Cat(false, 10, "Mursik", "black"));
        catCollection.add(new Cat(false, 10, "The Cat", "black"));
        catCollection.add(new Cat(false, 10, "Pillip", "black"));
        catCollection.add(new Cat(false, 10, "Pillip", "black"));

        System.out.println(catCollection.size());

        for(Cat cat : catCollection){
            System.out.println(cat);
        }


        //genericAndCollections();
        //rawList();
    }
    private static void someMethod(Iterable<Cat> cats){
        //cats.forEach(System.out::println);
        for (Cat cat : cats){
            System.out.println(cat);
        }
    }

    private static void genericAndCollections(){
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat(false, 10, "tom", "black"));
        cats.add(new Kitten(false, 10, "tom", "black"));

        Cat cat = cats.get(0);
        //Kitten kitten = cats.get(1);
        Object o = cats.get(1);
    }

    private static void rawList() {
        ArrayList list = new ArrayList();
        list.add(new Cat(false, 10, "tom", "black"));
        list.add(10);
        list.add("word");

        for (Object o : list){
            System.out.println(o);
        }

        //list.forEach(System.out::println);

        Cat cat = (Cat) list.get(0);
        Integer i = (Integer) list.get(1);
        String s = (String) list.get(2);
    }
}
