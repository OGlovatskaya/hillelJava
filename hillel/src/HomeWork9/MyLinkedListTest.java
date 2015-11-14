package HomeWork9;

import org.junit.Test;

/**
 * Created by user on 03.11.2015.
 */
public class MyLinkedListTest {

    @Test
    public void add(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");

        System.out.println(list.toString());
    }

    @Test
    public void get(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");

        System.out.println(list.get(2));
    }

    @Test
    public void size(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");

        System.out.println(list.size());
    }

    @Test
    public void equals(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");

        MyLinkedList list1 = new MyLinkedList();
        list1.add("b");
        list1.add("p");
        list1.add("v");
        list1.add("c");
        list1.add("t");

        System.out.println(list.equals(list1));
    }

    @Test
    public void contains(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");

        System.out.println(list.contains("b"));
        System.out.println(list.contains("f"));
    }

    @Test
    public void removeByIndex(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");

        list.removeByIndex(2);
        System.out.println(list.toString());
    }

    @Test
    public void removeByValue(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");

        list.removeByValue("b");
        System.out.println(list.toString());
    }

    @Test
    public void addAndMove(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");

        list.addAndMove(1, "f");
        System.out.println(list.toString());
    }

    @Test
    public void addAndReplace(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");

        list.addAndReplace(2, "j");
        System.out.println(list.toString());
    }

    @Test
    public void clean(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");
        System.out.println(list.toString());

        list.clean();
        System.out.println(list.toString());

    }

    @Test
    public void isEmpty(){
        MyLinkedList list = new MyLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");
        System.out.println(list.toString());
        System.out.println(list.isEmpty());

        list.clean();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
