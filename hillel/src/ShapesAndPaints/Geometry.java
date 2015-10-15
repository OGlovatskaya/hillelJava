package ShapesAndPaints;

/**
 * Created by user on 14.10.2015.
 */
public class Geometry {
    public static void main (String[] args){
        Blue blue = new Blue();
        Circle circle = new Circle(blue,3);
        System.out.println(circle.toString());
    }
}
