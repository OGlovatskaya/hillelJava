package HomeWork7;

import java.util.Arrays;

/**
 * Created by user on 22.10.2015.
 */
public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }return array;
    }
}

