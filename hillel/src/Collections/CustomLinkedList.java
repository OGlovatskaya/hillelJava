package Collections;

/**
 * Created by OGlovatskaya on 26.10.2015.
 */
public class CustomLinkedList {
    private ListElement head;

    public int size() {
        if (head==null){
            return 0;
        } else {
            ListElement current = head;
            int count = 1;
            while (current.next != null){
                current = current.next;
                count++;
            }
            return count;
        }
    }

    public void add(Object value) {
        if (head == null){
            head = new ListElement(value);
        } else {
            ListElement current = head;

            while (current.next !=null){
                current = current.next;
            }
            current.next = new ListElement(value);
        }
    }

    public Object get(int index) {
        if (head == null){
            return null;
        }else {
            ListElement current = head;
            for (int i = index; i!=0; i--){
                if (current.next == null){
                    return null;
                }
                current = current.next;
            }
            return current.value;
        }
    }
}
