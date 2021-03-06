package HomeWork7;

import HomeWork4.ImprovedArray;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by user on 22.10.2015.
 */
public class BubbleSort implements Sort {

    @Override
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

    @Override
    public ImprovedArray improvedArraySort(ImprovedArray array, Comparator comparator) {
        int length = array.size();
        for (int i = length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (comparator.compare(array.get(j), array.get(j + 1)) > 0) {
                    Object tmp = array.get(j);
                    array.addAndReplace(j, array.get(j + 1));
                    array.addAndReplace(j + 1, tmp);
                }
            }
        return array;
    }

    @Override
    public ImprovedArray improvedArraySort(ImprovedArray array) {
        int length = array.size();
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                Comparable first = (Comparable) array.get(j);
                Comparable second = (Comparable) array.get(j + 1);
                int g = first.compareTo(second);
                if (g > 0) {
                    Comparable tmp = (Comparable) array.get(j);
                    array.addAndReplace(j, array.get(j + 1));
                    array.addAndReplace(j + 1, tmp);
                }
            }
        }
        return array;
    }
}




