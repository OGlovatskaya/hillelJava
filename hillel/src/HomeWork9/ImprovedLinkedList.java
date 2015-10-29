package HomeWork9;

/**
 * Created by user on 28.10.2015.
 */
public class ImprovedLinkedList {
    private ImprovedListElement head;
    private int counter = 0;

    public int size() {
        if (head == null) {
            return 0;
        } else {
            ImprovedListElement current = head;
            int counter = 1;
            while (current.next != null) {
                current = current.next;
                counter++;
            }
            return counter;
        }
    }

    public void add(Object object) {
        if (head == null) {
            head = new ImprovedListElement(object);
        } else {
            ImprovedListElement current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ImprovedListElement(object);
        }
    }

    public Object get(int index) {
        if (head == null) {
            return null;
        }
        if (index < 0 || index > size()) {
            return null;
        } else {
            ImprovedListElement current = head;
            for (int i = 1; i <= index; i++) {
                current = current.next;
            }
            return current.value;
        }
    }

    public boolean contains(Object object) {
        ImprovedListElement current;
        for (current = head; current != null; current = current.next) {
            if (object.equals(current.value)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        ImprovedListElement current = head;
        for (int i = 0; i < size(); i++) {
            if (current != null) {
                return false;
            }
        }
        return true;
    }

    public void removeByIndex(int index) {
        ImprovedListElement current = head;
        if (!(index < 0 || index > size())) {
            for (int i = 1; i <= index; i++) {
                current = current.next;
            }
        }
        current.value = null;
        counter--;
    }

    @Override
    public String toString() {
        String string = "[ ";
        ImprovedListElement current;
        for (current = head; current != null; current = current.next) {
            string += current.value + " ";
        }
        return string + "]";
    }
}


