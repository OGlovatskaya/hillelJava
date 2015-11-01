package HomeWork9;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by user on 29.10.2015.
 */
public class Main {
    public static void main(String[] args){
        ImprovedLinkedList list = new ImprovedLinkedList();
        list.add("b");
        list.add("p");
        list.add("v");
        list.add("c");
        list.add("m");
        System.out.println(list.toString());

        ImprovedLinkedList list1 = new ImprovedLinkedList();
        list1.add("b");
        list1.add("p");
        list1.add("v");
        list1.add("c");
        list1.add("m");
        /*System.out.println(list.equals(list1));

        list1.addAndMove(5, "q");
        System.out.println(list1.toString());
        System.out.println(list1.size());*/

        list1.addAndReplace(1, "l");
        System.out.println(list1.toString());
        System.out.println(list1.size());

        /*list.clean();
        System.out.println(list.toString());
        System.out.println(list.size());*/


        /*list.removeByValue("c");
        list.removeByValue("b");
        System.out.println(list.toString());
        list.removeByValue("p");
        System.out.println(list.toString());
        list.removeByValue("v");
        System.out.println(list.toString());
        list.removeByValue("c");
        System.out.println(list.toString());
        System.out.println(list.size());
        list.removeByIndex(5);
        System.out.println(list.toString());
        list.removeByIndex(1);
        System.out.println(list.toString());
        list.removeByIndex(2);
        System.out.println(list.toString());
        list.removeByValue("v");
        System.out.println(list.toString());
        list.removeByValue("p");
        System.out.println(list.toString());*/



    }
}
