package HomeWork9;

/**
 * Created by user on 03.11.2015.
 */
public class MyLinkedList implements MyList {

    private MyListElement head;

    public void add(Object object) {
        if (head == null) {
            head = new MyListElement(object);
        } else {
            MyListElement current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new MyListElement(object);
        }
    }

    public Object get(int index) {
        if (head == null) {
            return null;
        }
        if (index < 0 || index > size()) {
            return null;
        } else {
            MyListElement current = head;
            for (int i = 1; i <= index; i++) {
                current = current.next;
            }
            return current.value;
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        } else {
            MyListElement current = head;
            int counter = 1;
            while (current.next != null) {
                current = current.next;
                counter++;
            }
            return counter;
        }
    }

    public boolean equals(Object other) {
        MyLinkedList list = (MyLinkedList) other;
        if (this.size() != list.size()) return false;
        for (int i = 0; i < this.size(); i++) {
            if (!(list.get(i).equals(this.get(i)))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String string = "[ ";
        MyListElement current;
        for (current = head; current != null; current = current.next) {
            string += current.value + " ";
        }
        return string + "]";
    }

    public boolean contains(Object object) {
        MyListElement current;
        for (current = head; current != null; current = current.next) {
            if (object.equals(current.value)) {
                return true;
            }
        }
        return false;
    }

    public void removeByIndex(int index) {
        if (index < 0 || index > size()) {
            System.out.println("Incorrect index");
        } else {
            if (index == 0) {
                head = head.next;
            } else {
                MyListElement current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
        }
    }

    public void removeByValue(Object object) {
        if (head.value.equals(object)) {
            head = head.next;
        } else {
            MyListElement current = head;
            MyListElement previous = null;
            while (!(current.value.equals(object))) {
                previous = current;
                current = current.next;
            }
            previous.next = previous.next.next;
        }
    }

    public void addAndMove(int index, Object object) {
        MyListElement temp = new MyListElement(object);
        MyListElement current = head;
        if (index == 0) {
            head = new MyListElement(object);
            head.next = current;
        } else {
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
        }
    }

    public void addAndReplace(int index, Object object) {
        MyListElement temp = new MyListElement(object);
        MyListElement current = head;
        if (index == 0) {
            head = temp;
            temp.next = current.next;
        } else {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.value = temp.value;
            temp.next = current.next;
        }
    }

    public void clean() {
        MyListElement current = head;
        head = null;
        for (int i = 0; i < size(); i++) {
            current = current.next = null;
        }
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        }
        return true;
    }
}
