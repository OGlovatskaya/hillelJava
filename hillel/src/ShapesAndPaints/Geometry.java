package ShapesAndPaints;

/**
 * Created by user on 14.10.2015.
 */
public class Geometry {
    public static void main (String[] args){
        Blue blue = new Blue();
        Circle circle = new Circle(blue,3);
        System.out.println(circle);

        Yellow yellow = new Yellow();
        Rectangle rectangle = new Rectangle(yellow, 5, 10);
        System.out.println(rectangle);

        Red red = new Red();
        Triangle triangle = new Triangle(red, 5, 6, 7);
        System.out.println(triangle);
    }
}
