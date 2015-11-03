package HomeWork9;

/**
 * Created by user on 03.11.2015.
 */
public interface MyList {

    void add(Object object);
    Object get(int index);
    int size();
    boolean equals(Object other);
    String toString();
    boolean contains(Object object);
    void removeByIndex(int index);
    void removeByValue(Object object);
    void addAndMove(int index, Object object);
    void addAndReplace(int index, Object object);
    void clean();
    boolean isEmpty();
}