package HomeWork8;

import HomeWork4.ImprovedArray;
import org.junit.Test;

/**
 * Created by user on 25.10.2015.
 */
public class ArrayTest {

    @Test
    public void add(){
        ImprovedArray array = new ImprovedArray();
        array.add("v");
        array.add("b");
        array.add("r");
        array.add("t");
        System.out.println(array);
    }


    @Test
    public void size(){
        ImprovedArray array = new ImprovedArray();
        array.add("v");
        array.add("b");
        array.add("r");
        array.add("t");

        System.out.println(array.size());
    }

    @Test
    public void equals(){
        ImprovedArray array = new ImprovedArray();
        array.add("v");
        array.add("b");
        array.add("r");
        array.add("t");

        ImprovedArray array1 = new ImprovedArray();
        array1.add("v");
        array1.add("b");
        array1.add("r");
        array1.add("t");

        System.out.println(array.equals(array1));
    }

    @Test
    public void contains(){
        ImprovedArray array = new ImprovedArray();
        array.add("v");
        array.add("b");
        array.add("r");
        array.add("t");

        System.out.println(array.contains("m"));
    }

    @Test
    public void removeByIndex(){
        ImprovedArray array = new ImprovedArray();
        array.add("v");
        array.add("b");
        array.add("r");
        array.add("t");

        //System.out.println(array.removeByIndex(0));
    }
}
