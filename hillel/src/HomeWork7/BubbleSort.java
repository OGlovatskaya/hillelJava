package HomeWork7;

import HomeWork4.ImprovedArray;

import java.util.Arrays;

/**
 * Created by user on 22.10.2015.
 */
public class BubbleSort {

    public Comparable[] bubbleSort(Comparable[] array) {
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
    }

    public int[] bubbleSort(int[] array) {
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

    public ImprovedArray bubbleSort(ImprovedArray array) {
        int length = array.size();
        for (int i = length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                int g = array.get(j).compareTo(array.get(j + 1));
                if (g > 0) {
                    swap(array, j+1, j);
                    /*int j1 = (int) array.get(j);
                    Comparable tmp = array.get(j);
                    array[j] = array.get(j + 1);
                    array[j + 1] = tmp;*/
                }
            }
        return array;
    }

    static void swap(ImprovedArray array, int index1, int index2) {
        Comparable temp = array.get(index1);
        array.addAndReplace(index1, array.get(index2));
        array.addAndReplace(index2, temp);
    }

    public static void print(Comparable[] a){
        int count=a.length;
        System.out.print("[" + a[0] + ", ");
        for(int i=1;i<count-1;i++){
            System.out.print(a[i]+", ");
        }
        System.out.println(a[count - 1] + "]");
    }
}
