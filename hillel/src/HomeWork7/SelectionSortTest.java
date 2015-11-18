package HomeWork7;

import HomeWork4.ImprovedArray;
import HomeWork5.Animals.Cat;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by user on 11.11.2015.
 */
public class SelectionSortTest {

    @Test
    public void intSort() {
        int[] ints = {8, 6, 9, 1, 7, 4, 5, 3, 2, 0};
        System.out.println(Arrays.toString(ints));

        SelectionSort sort = new SelectionSort();
        int[] intsSorted = sort.intSort(ints);
        System.out.println(Arrays.toString(intsSorted));
    }

    @Test
    public void improvedArraySort() {
        ImprovedArray array = new ImprovedArray();
        array.add("c");
        array.add("b");
        array.add("f");
        array.add("a");
        array.add("e");
        array.add("d");
        System.out.println(array.toString());

        SelectionSort sort = new SelectionSort();
        ImprovedArray arraySorted = sort.improvedArraySort(array);
        System.out.println(arraySorted.toString());

        ImprovedArray array1 = new ImprovedArray();
        array1.add(5);
        array1.add(9);
        array1.add(6);
        array1.add(1);
        array1.add(3);
        array1.add(4);
        array1.add(0);
        array1.add(8);
        array1.add(7);
        array1.add(2);
        System.out.println(array1.toString());

        SelectionSort sort1 = new SelectionSort();
        ImprovedArray array1Sorted = sort1.improvedArraySort(array1);
        System.out.println(array1Sorted.toString());
    }
}
