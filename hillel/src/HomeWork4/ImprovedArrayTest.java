package HomeWork4;


import org.junit.Test;

/**
 * Created by user on 14.11.2015.
 */
public class ImprovedArrayTest {
    @Test
    public void add() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        System.out.println(array.toString());
    }

    @Test
    public void size() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        System.out.println(array.size());
    }

    @Test
    public void get() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        System.out.println(array.get(0));
    }

    @Test
    public void equals() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        ImprovedArray array1 = new ImprovedArray();
        array1.add("a");
        array1.add("b");
        array1.add("c");
        array1.add("d");
        array1.add("e");

        System.out.println(array.equals(array1));
    }

    @Test
    public void contains() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        System.out.println(array.contains("t"));
    }

    @Test
    public void removeByIndex() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        array.removeByIndex(1);

        System.out.println(array.toString());
    }

    @Test
    public void removeByValue() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        array.removeByValue("e");
        System.out.println(array.toString());
    }

    @Test
    public void addAndReplace() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        array.addAndReplace(1, "f");
        System.out.println(array.toString());
    }

    @Test
    public void addAndMove() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        array.addAndMove(2, "t");

        System.out.println(array.toString());
    }

    @Test
    public void clean() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");
        System.out.println(array.toString());

        array.clean();
        System.out.println(array.toString());
    }

    @Test
    public void isEmpty() {
        ImprovedArray array = new ImprovedArray();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        System.out.println(array.isEmpty());
    }
}
