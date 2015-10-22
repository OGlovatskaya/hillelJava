package HomeWork4;

import HomeWork7.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 21.10.2015.
 */
public class ImprovedArrayMain {
    public static void main(String [] args) {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        System.out.println(array.toString());

        ImprovedArray array1 = new ImprovedArray();
        array1.add("a");
        array1.add("b");
        array1.add("c");
        array1.add("d");
        array1.add("e");

        System.out.println(array1.toString());

        System.out.println(array.equals(array1));
        System.out.println(array.contains("j"));

        array.remove(4);
        System.out.println(array);

        array1.remove("f");
        System.out.println(array1);

        System.out.println(array.get(2));

        array1.addAndReplace(1, "v");
        System.out.println(array1);

        /*ArrayList arrayList = new ArrayList();
        arrayList.remove(5);
        arrayList.remove("b");
        arrayList.add();
        arrayList.ensureCapacity();*/
    }

}

