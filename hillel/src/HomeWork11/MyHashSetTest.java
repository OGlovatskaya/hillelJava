package HomeWork11;

import org.junit.Test;

/**
 * Created by user on 17.12.2015.
 */
public class MyHashSetTest {

    @Test
    public void add(){
        MyHashSet set = new MyHashSet();
        set.add("RED");
        set.add("BLUE");
        set.add("YELLOW");
        System.out.println(set);
    }

    @Test
    public void remove(){
        MyHashSet set = new MyHashSet();
        set.add("RED");
        set.add("BLUE");
        set.add("YELLOW");
        System.out.println(set);

        set.remove("RED");
        System.out.println(set);
    }

    @Test
    public void contains(){
        MyHashSet set = new MyHashSet();
        set.add("RED");
        set.add("BLUE");
        set.add("YELLOW");

        System.out.println(set.contains("RED"));
        System.out.println(set.contains("GREEN"));
    }
}
