package HomeWork7;

import HomeWork4.ImprovedArray;

import java.util.Arrays;

/**
 * Created by user on 22.10.2015.
 */
public class BubbleSort extends Sort {

    public int[] intSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public ImprovedArray improvedArraySort(ImprovedArray array) {
        int length = array.size();
        for (int i = length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                int g = array.get(j).compareTo(array.get(j + 1));
                if (g > 0) {
                    Comparable tmp = array.get(j);
                    array.addAndReplace(j, array.get(j + 1));
                    array.addAndReplace(j + 1, tmp);
                }
            }
        return array;
    }

    /*public Comparable[] comparableSort(ImprovedArray array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                Comparable first = array[j];
                Comparable second = array[j + 1];

                int g = first.compareTo(second);

                if (g > 0) {
                    Comparable tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }*/
}

