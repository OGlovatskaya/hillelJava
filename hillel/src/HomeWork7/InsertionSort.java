package HomeWork7;

import HomeWork4.ImprovedArray;

import java.util.Arrays;

/**
 * Created by user on 11.11.2015.
 */
public class InsertionSort extends Sort {
    @Override
    public int[] intSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = 0;
            for (j = i; j > 0; j--) {
                if (temp < array[j - 1]) {
                    array[j] = array[j - 1];
                } else break;
            }
            array[j] = temp;
        }
        return array;
    }

    @Override
    public ImprovedArray improvedArraySort(ImprovedArray array) {
        for (int i = 1; i < array.size(); i++) {
            Comparable temp = (Comparable) array.get(i);
            int j = 0;
            for (j = i; j > 0; j--) {
                if (temp.compareTo(array.get(j - 1)) < 0) {
                    array.addAndReplace(j, array.get(j - 1));
                } else break;
            }
            array.addAndReplace(j, temp);
        }
        return array;
    }
}