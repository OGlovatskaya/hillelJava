package HomeWork7;

import HomeWork4.ImprovedArray;

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
        }
        return array;
    }

    public static void print(int[] a){
        int count=a.length;
        System.out.print("[" + a[0] + ", ");
        for(int i=1;i<count-1;i++){
            System.out.print(a[i]+", ");
        }
        System.out.println(a[count - 1] + "]");
    }


    /*public Comparable[] bubbleSort(ImprovedArray array) {
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


    public ImprovedArray bubbleSort(ImprovedArray array) {
        int length = array.size();
        for (int i = length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                int g = array.get(j).compareTo(array.get(j + 1));
                if (g > 0) {
                    Comparable tmp = array.get(j);
                    array.addAndReplace(j, array.get(j+1));
                    array.addAndReplace(j+1, tmp);
                }
            }
        return array;
    }

    public static void print(ImprovedArray a){
        int count=a.size();
        System.out.print("[" + a.get(0) + ", ");
        for(int i=1;i<count-1;i++){
            System.out.print(a.get(i)+", ");
        }
        System.out.println(a.get(count - 1) + "]");
    }
}

