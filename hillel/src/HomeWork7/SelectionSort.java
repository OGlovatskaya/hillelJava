package HomeWork7;

import HomeWork4.ImprovedArray;

/**
 * Created by user on 04.11.2015.
 */
public class SelectionSort extends Sort {

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

    public ImprovedArray improvedArraySort(ImprovedArray array) {
        for (int i = 0; i < array.size(); i++) {
            int smallIndex = i;
            for (int j = i + 1; j < array.size(); j++)
                if (array.get(j).compareTo(array.get(smallIndex)) < 0) {
                    smallIndex = j;
                }
            if (smallIndex != i) {
                Comparable tmp = array.get(smallIndex);
                array.addAndReplace(smallIndex, array.get(i));
                array.addAndReplace(i, tmp);
            }
        }
        return array;
    }

    /*public Comparable[] comparableSort(ImprovedArray array) {
        for (int i = 0; i < array.size(); i++) {
            int smallIndex = i;
            for (int j = i + 1; j < array.size(); j++)
                if (array.get(j).compareTo(array.get(smallIndex)) < 0) {
                    smallIndex = j;
                }
            if (smallIndex != i) {
                Comparable tmp = array.get(smallIndex);
                array.addAndReplace(smallIndex, array.get(i));
                array.addAndReplace(i, tmp);
            }
        }
        return array;
    }*/
}
