package HomeWork10;

import HomeWork4.ImprovedArray;

import java.util.Iterator;

/**
 * Created by user on 04.12.2015.
 */
public class ImprovedArrayIterator  implements Iterator {
    private final ImprovedArray array;
    private int currentIndex = 0;

    public ImprovedArrayIterator(ImprovedArray array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < array.size();
    }

    @Override
    public Object next() {
        return array.get(this.currentIndex++);

    }

    @Override
    public void remove() {
        array.removeByIndex(--currentIndex);
    }

}
