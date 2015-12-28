package HomeWork11;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by user on 17.12.2015.
 */
public class MyHashSet implements Iterable{
    private HashMap map;

    public MyHashSet() {
        this.map = new HashMap<>();
    }

    public void add(Object obj){
        map.put(obj, null);
    }

    public void remove(Object obj){
        map.remove(obj);
    }

    public boolean contains(Object obj){
        return map.containsKey(obj);
    }

    @Override
    public String toString() {
        return map.keySet().toString();
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }
}
