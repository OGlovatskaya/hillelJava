package Incapsulation;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by OGlovatskaya on 15.10.2015.
 */
public class IncapsulationMain {
    public static void main(String[] args){
        ImprovedArray array = new ImprovedArray();
        array.add(1);
        array.add(12);
        array.add(31);
        array.add(21);
        array.add(21);
        array.add(21);
        System.out.println(array);
    }
}
