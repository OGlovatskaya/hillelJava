package HomeWork9;

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

        System.out.println(list.get(2));

        System.out.println(list.contains("b"));

        System.out.println(list.isEmpty());

        list.removeByIndex(1);
        //System.out.println(list.get(1));

        System.out.println(list.toString());


    }
}
