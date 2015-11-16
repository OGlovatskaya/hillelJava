package HomeWork4;

import HomeWork12.MyException;
import HomeWork9.MyList;

import java.util.Arrays;

import static java.util.Arrays.*;

import java.util.Objects;

/**
 * Created by user on 21.10.2015.
 */
public class ImprovedArray implements MyList{
    //private String[] ints = new String[10];
    //private Comparable[] ints = new Comparable[10];
    private Object[] ints = new Object[10];

    private int counter = 0;

    public void add(Object value) {
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

    public Object get(int index) {
        if (index < 0 || index > size()) {
            throw new MyException("Incorrect index");
        } else
            return ints[index];
    }

    public boolean equals(Object other) {
        ImprovedArray intsOther = (ImprovedArray) other;
        if (this.size() != intsOther.size()) return false;
        if (this.counter != intsOther.counter) return false;
        for (int i = 0; i < this.size(); i++) {
            if (this.ints[i] != (intsOther.get(i))) return false;
        }
        return true;
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

    public boolean contains(Object obj) {
        for (int i = 0; i < counter; i++) {
            if (ints[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void removeByIndex(int index) {
        if (index < 0 || index > size()) {
            throw new MyException("Incorrect index");
        } else {
            int numMoved = counter - index - 1;
            System.arraycopy(ints, index + 1, ints, index,
                    numMoved);
            counter--;
        }
    }

    public void removeByValue(Object obj) {
        if (!(this.contains(obj))) {
            throw new MyException("Incorrect value");
        } else {
            for (int index = 0; index < counter; index++) {
                if (obj.equals(ints[index])) {
                    int numMoved = counter - index - 1;
                    System.arraycopy(ints, index + 1, ints, index,
                            numMoved);
                    counter--;
                }
            }
        }
    }

    public void addAndReplace(int index, Object object) {
        if (index < 0 || index > size()) {
            throw new MyException("Incorrect index");
        } else
            ints[index] = object;
    }

    public void addAndMove(int index, Object object) {
        if (index < 0 || index > size()) {
            throw new MyException("Incorrect index");
        } else {
            this.resize();
            System.arraycopy(this.ints, index, this.ints, index + 1, this.size() - index);
            this.ints[index] = object;
            this.counter++;
        }
    }

    public void clean() {
        for (int i = 0; i < counter; i++) {
            ints[i] = null;
            counter = 0;
        }
    }

    public boolean isEmpty() {
        for (int i = 0; i < counter; i++) {
            if (ints[i] != null) {
                return false;
            }
        }
        return true;
    }
}
