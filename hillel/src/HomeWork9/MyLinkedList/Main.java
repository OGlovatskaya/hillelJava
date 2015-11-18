package HomeWork9.MyLinkedList;


/**
 * Created by user on 29.10.2015.
 */
public class Main {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");
        System.out.println(list.toString());

        MyLinkedList list1 = new MyLinkedList();
        list1.add("b");
        list1.add("p");
        list1.add("v");
        list1.add("c");
        list1.add("m");
        System.out.println(list1.toString());

        System.out.println(list.equals(list1));

        list1.addAndMove(4, "q");
        System.out.println(list1.toString());
        System.out.println(list1.size());

        list1.addAndReplace(4, "l");
        System.out.println(list1.toString());
        System.out.println(list1.size());

        list1.removeByValue("p");
        System.out.println(list1.toString());
        System.out.println(list1.size());

        list1.removeByIndex(5);
        System.out.println(list1.toString());
        System.out.println(list1.size());

        list.clean();
        System.out.println(list.toString());
        System.out.println(list.size());

    }
}
