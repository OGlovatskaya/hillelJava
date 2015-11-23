package Patterns.Iterator;

import Collections.RecursiveLinkedList;
import OOP.Cat;
import org.hamcrest.internal.ArrayIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by OGlovatskaya on 29.10.2015.
 */
public class MainIterator {
    public static void main(String[] args) {
        Cat tom = new Cat(false, 4, "Tom", "Black");
        Cat murzik = new Cat(true, 3, "Murzik", "White");
        Cat barsik = new Cat(false, 6, "Barsik", "Blue");

        RecursiveLinkedList cats = new RecursiveLinkedList();
        cats.add(tom);
        cats.add(murzik);
        cats.add(barsik);

        Iterator iterator = new RecursiveLinkedListIterator(cats);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*for (int i = 0; i < cats.size(); i++){
            cats.get(1);
        }*/

        List someList = new ArrayList<>();

        System.out.println("in foreach loop: ");
        for (Object o : cats) {
            System.out.println(o);
        }

        Iterator iterator1 = cats.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
