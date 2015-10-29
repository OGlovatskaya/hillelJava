package HomeWork4;


import HomeWork7.BubbleSort;

import java.util.LinkedList;

/**
 * Created by user on 21.10.2015.
 */
public class ImprovedArrayMain {
    public static void main(String [] args) {
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

        /*System.out.println(array1.toString());

        System.out.println(array.equals(array1));
        System.out.println(array.contains("j"));*/

        array.removeByIndex(4);
        System.out.println(array.toString());

        array1.removeByValue("b");
        System.out.println(array1);

        System.out.println(array.get(2));

        array1.addAndReplace(1, "v");
        System.out.println(array1);

        int[] ints = {3,5,7,9,8,4,6,1,2};
        int[] expectedInts = {1,2,3,4,5,6,7,8,9};

        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedInts = bubbleSort.bubbleSort(ints);

        bubbleSort.print(sortedInts);

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

        BubbleSort bubbleSort1 = new BubbleSort();
        ImprovedArray sorted = bubbleSort1.bubbleSort(unsorted);

        bubbleSort1.print(sorted);

        LinkedList list = new LinkedList();
        list.toString();


    }
}

