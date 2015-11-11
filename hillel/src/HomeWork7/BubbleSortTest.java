package HomeWork7;

import HomeWork4.ImprovedArray;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by user on 11.11.2015.
 */
public class BubbleSortTest {
    @Test
    public void intSort() {
        int[] ints = {8, 6, 9, 1, 7, 4, 5, 3, 2, 0};
        System.out.println(Arrays.toString(ints));

        BubbleSort bubbleSort = new BubbleSort();
        int[] intsSorted = bubbleSort.intSort(ints);
        System.out.println(Arrays.toString(intsSorted));
    }

    @Test
    public void improvedArraySort() {
        ImprovedArray array = new ImprovedArray();
        array.add(5);
        array.add(9);
        array.add(6);
        array.add(1);
        array.add(3);
        array.add(4);
        array.add(0);
        array.add(8);
        array.add(7);
        array.add(2);
        System.out.println(array.toString());

        BubbleSort bubbleSort = new BubbleSort();
        ImprovedArray arraySorted = bubbleSort.improvedArraySort(array);
        System.out.println(arraySorted.toString());
    }
}
