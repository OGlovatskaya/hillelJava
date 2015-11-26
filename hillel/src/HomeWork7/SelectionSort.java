package HomeWork7;

import HomeWork4.ImprovedArray;

import java.util.Comparator;

/**
 * Created by user on 04.11.2015.
 */
public class SelectionSort implements Sort {

    @Override
    public int[] intSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallIndex]) {
                    smallIndex = j;
                }
            }
            int smallerNumber = array[smallIndex];
            array[smallIndex] = array[i];
            array[i] = smallerNumber;
        }
        return array;
    }

    @Override
    public ImprovedArray improvedArraySort(ImprovedArray array) {
        for (int i = 0; i < array.size(); i++) {
            int smallIndex = i;
            for (int j = i + 1; j < array.size(); j++) {
                Comparable first = (Comparable) array.get(j);
                Comparable second = (Comparable) array.get(smallIndex);
                if (first.compareTo(second) < 0) {
                    smallIndex = j;
                }
            }
            if (smallIndex != i) {
                Comparable tmp = (Comparable) array.get(smallIndex);
                array.addAndReplace(smallIndex, array.get(i));
                array.addAndReplace(i, tmp);
            }
        }
        return array;
    }

    @Override
    public ImprovedArray improvedArraySort(ImprovedArray array, Comparator comparator) {
        for (int i = 0; i < array.size(); i++) {
            int smallIndex = i;
            for (int j = i + 1; j < array.size(); j++) {
                Object first = array.get(j);
                Object second = array.get(smallIndex);
                if (comparator.compare(first, second) < 0) {
                    smallIndex = j;
                }
            }
            if (smallIndex != i) {
                Object tmp = array.get(smallIndex);
                array.addAndReplace(smallIndex, array.get(i));
                array.addAndReplace(i, tmp);
            }
        }
        return array;
    }
}
