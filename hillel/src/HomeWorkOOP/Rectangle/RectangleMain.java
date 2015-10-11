package HomeWorkOOP.Rectangle;

/**
 * Created by user on 11.10.2015.
 */
public class RectangleMain {
    public static void main(String[] args) {

        RectangleTask rectangle = new RectangleTask(30, 50);
        System.out.println(rectangle.getRectangle());

        RectangleTask rectangle1 = new RectangleTask(32, 63);
        System.out.println(rectangle1.getRectangle());

        RectangleTask rectangle2 = new RectangleTask(40, 96);
        System.out.println(rectangle2.getRectangle());
    }
}
