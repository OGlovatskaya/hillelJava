package HomeWork10;

import HomeWork4.ImprovedArray;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by user on 22.11.2015.
 */
public class ImprovedArrayIteratorTest {

    @Test
    public void hasNext(){
        ImprovedArray array = new ImprovedArray();
        array.add(1);
        array.add(5);
        array.add(7);
        array.add(9);

        Iterator iterator = new ImprovedArrayIterator(array);
        System.out.println(iterator.hasNext());

        ImprovedArray array1 = new ImprovedArray();
        Iterator iterator1 = new ImprovedArrayIterator(array1);
        System.out.println(iterator1.hasNext());
    }

    @Test
    public void next(){
        ImprovedArray array = new ImprovedArray();
        array.add(1);
        array.add(5);
        array.add(7);
        array.add(9);

        System.out.println(array.toString());

        Iterator iterator = new ImprovedArrayIterator(array);
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        ImprovedArray array2 = new ImprovedArray();
        array2.add(1);
        array2.add(5);
        array2.add(7);
        array2.add(9);
        array2.add(3);
        array2.add(2);
        array2.add(4);
        array2.add(6);

        System.out.println();
        for (Object o : array2) {
            System.out.print(o + " ");
        }
    }

    @Test
    public void remove(){
        ImprovedArray array = new ImprovedArray();
        array.add(1);
        array.add(5);
        array.add(7);
        array.add(9);
        System.out.println(array.toString());

        Iterator iterator = new ImprovedArrayIterator(array);
        iterator.next();
        iterator.remove();
        System.out.println(array.toString());
    }
}
