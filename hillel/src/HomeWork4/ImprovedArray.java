package HomeWork4;
import java.util.Arrays;

import static java.util.Arrays.*;


/**
 * Created by user on 21.10.2015.
 */
public class ImprovedArray {
    private Object[] ints = new String[10];
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
        return ints[index];
    }

    public boolean equals(ImprovedArray other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        if (counter != other.counter) return false;
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

    public boolean contains(Object obj) {
        for (int i = 0; i < counter; i++){
            if (ints[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index){
        if (index < counter){
            int numMoved = counter - index - 1;
                System.arraycopy(ints, index+1, ints, index,
                        numMoved);
            counter--;
        }
    }

    public void remove(Object obj){
        for(int index = 0; index < counter; index++){
           if (obj.equals(ints[index])){
               int numMoved = counter - index - 1;
               System.arraycopy(ints, index+1, ints, index,
                       numMoved);
               counter--;
           }
        }
    }
}
