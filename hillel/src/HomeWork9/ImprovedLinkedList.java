package HomeWork9;

/**
 * Created by user on 28.10.2015.
 */
public class ImprovedLinkedList {

    private ImprovedListElement head;
    private int counter = 0;

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

    public boolean equals(Object other) {
        ImprovedLinkedList list = (ImprovedLinkedList) other;
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
        ImprovedListElement current;
        for (current = head; current != null; current = current.next) {
            string += current.value + " ";
        }
        return string + "]";
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

    public void removeByIndex(int index) {
        if (index < 0 || index > size()) {
            System.out.println("Incorrect index");
        } else {
            if (index == 0) {
                head = head.next;
            } else {
                ImprovedListElement current = head;
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
            ImprovedListElement current = head;
            ImprovedListElement previous = null;
            while (!(current.value.equals(object))) {
                previous = current;
                current = current.next;
            }
            previous.next = previous.next.next;
        }
    }

    public void addAndMove(int index, Object object) {
        ImprovedListElement temp = new ImprovedListElement(object);
        ImprovedListElement current = head;
        if (index == 0) {
            head = new ImprovedListElement(object);
            head.next = current;
        } else {
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
        counter++;
        }
    }

    /*public void addAndReplace(int index, Object object) {
        ImprovedListElement temp = new ImprovedListElement(object);
        ImprovedListElement current = head;
        if (index == 0) {
            head = temp;
            temp.next = current.next;
            //head.next = current;
        } else {
            for (int i = 1; i < index; i++) {
                current = current.next;
                //current.value = temp;
            }
            //current.value = temp;
            temp.next = current;
            current = temp;
            //current = temp;
            //counter++;
        }
    }*/

    public void clean() {
        ImprovedListElement current = head;
        head = null;
        for (int i = 0; i < size(); i++) {
            current = current.next = null;
            counter = 0;
        }
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        }
        return true;
    }
}
