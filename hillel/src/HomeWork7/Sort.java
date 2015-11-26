package HomeWork7;

import HomeWork4.ImprovedArray;

import java.util.Comparator;

/**
 * Created by user on 25.11.2015.
 */
public interface Sort {
    int[] intSort(int[] array);

    ImprovedArray improvedArraySort(ImprovedArray array);

    ImprovedArray improvedArraySort(ImprovedArray array, Comparator comparator);

}
