package Incapsulation;

import java.util.Arrays;

import static java.util.Arrays.*;

/**
 * Created by OGlovatskaya on 15.10.2015.
 */
public class ImprovedArray {
    private int[] ints = new int[2];
    private int counter = 0;

    public void add(int i){
        if (ints.length == size()){
            resize();}
        ints[counter] = i;
        counter++;
    }

    private void resize(){
        ints = Arrays.copyOf(ints, ints.length * 2);
    }
    public int size(){
        return counter;
    }

    public int get (int index){
        return ints[index];
    }

    @Override
    public String toString() {
        return "ImprovedArray{" +
                "ints=" + Arrays.toString(ints) +
                ", counter=" + counter +
                '}';
    }
}


        //public void remove(int index)
        //public void remove(Object obj)



