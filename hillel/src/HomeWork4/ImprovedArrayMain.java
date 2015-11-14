package HomeWork4;


import HomeWork7.BubbleSort;
import HomeWork7.InsertionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

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


        ImprovedArray unsorted = new ImprovedArray();
        unsorted.add(1);
        unsorted.add(5);
        unsorted.add(7);
        unsorted.add(9);
        unsorted.add(3);
        unsorted.add(2);
        unsorted.add(4);
        unsorted.add(6);
        unsorted.add(8);
        unsorted.add(0);
        unsorted.add(11);
        unsorted.add(10);


        ArrayList arrayList = new ArrayList();
        arrayList.add("o");
        arrayList.add("b");
        arrayList.add("n");

        System.out.println(arrayList.toString());
        arrayList.remove("l");
        arrayList.remove(8);
        System.out.println(arrayList.toString());

    }
}

