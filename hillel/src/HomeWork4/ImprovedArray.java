package HomeWork4;

import java.util.Arrays;

import static java.util.Arrays.*;
import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * Created by user on 21.10.2015.
 */
public class ImprovedArray {
    private Comparable[] ints = new Comparable[10];
    //private Object[] ints = new String[10];
    private int counter = 0;

    public void add(Comparable value) {
        if (ints.length == size()) {
            resize();
        }
        ints[counter] = value;
        counter++;
    }

    private void resize() {
        ints = copyOf(ints, ints.length * 2);
    }

    public int size() {
        return counter;
    }

    public Comparable get(int index) {
        return ints[index];
    }


    public boolean equals(ImprovedArray other) {
        return Arrays.equals(ints, other.ints);
    }

    @Override
    public String toString() {
        String string = "[ ";
        for (int i = 0; i < counter; i++) {
            if (ints[i] != null) {
                string += ints[i] + " ";
            }
        }
        return string + "]" + ", counter = " + counter;
    }

    public boolean contains(Comparable obj) {
        for (int i = 0; i < counter; i++) {
            if (ints[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void removeByIndex(int index) {
        if (index < counter) {
            int numMoved = counter - index - 1;
            System.arraycopy(ints, index + 1, ints, index,
                    numMoved);
            counter--;
        }
    }

    public void removeByValue(Comparable obj) {
        for (int index = 0; index < counter; index++) {
            if (obj.equals(ints[index])) {
                int numMoved = counter - index - 1;
                System.arraycopy(ints, index + 1, ints, index,
                        numMoved);
                counter--;
            }
        }
    }

    public void addAndReplace(int index, Comparable obj) {
        ints[index] = obj;
        System.arraycopy(this.ints, index, ints, index, ints.length - index);
    }

    public void clean() {
        for (int i = 0; i < counter; i++){
            ints[i]=null;
            counter = 0;
        }
    }

    public boolean isEmpty() {
        for (int i = 0; i < counter; i++){
            if (ints[i] != null){
                return false;
            }
        } return true;
    }
}


