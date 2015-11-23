package HomeWork4;


import HomeWork10.ImprovedArrayIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by user on 21.10.2015.
 */
public class ImprovedArrayMain {
    public static void main(String[] args) {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        System.out.println(array.toString());

        ImprovedArray array1 = new ImprovedArray();
        array1.add("a");
        array1.add("b");
        array1.add("c");
        array1.add("d");
        array1.add("e");

        System.out.println(array1.equals(array));

        array1.addAndMove(4, "m");

        System.out.println(array1.toString());

        array1.addAndMove(3, "c");

        System.out.println(array1.toString());

        System.out.println(array.equals(array1));
        System.out.println(array.contains("j"));

        array.removeByIndex(4);
        System.out.println(array.toString());

        array1.removeByValue("o");
        System.out.println(array1);

        System.out.println(array.get(2));

        array1.addAndReplace(1, "v");
        System.out.println(array1);


        ImprovedArray array2 = new ImprovedArray();
        array2.add(1);
        array2.add(5);
        array2.add(7);
        array2.add(9);
        array2.add(3);
        array2.add(2);
        array2.add(4);
        array2.add(6);
        array2.add(8);
        array2.add(0);
        array2.add(11);
        array2.add(10);

        Iterator iterator = new ImprovedArrayIterator(array2);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        for (Object o : array2) {
            System.out.print(o + " ");
        }

        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        list.add("G");
        list.add("F");
        list.add("I");
        list.add("S");

        System.out.println(list.toString());

        ListIterator<String> listIterator = list.listIterator();

        System.out.println(listIterator.next());
        listIterator.remove();
        System.out.println(list.toString());

        System.out.println(listIterator.next());
        listIterator.remove();
        System.out.println(list.toString());
    }
}

