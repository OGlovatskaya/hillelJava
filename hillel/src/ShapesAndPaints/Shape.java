package ShapesAndPaints;

/**
 * Created by user on 13.10.2015.
 */
public abstract class Shape {

    public abstract double getPerimeter();
    public abstract double getArea ();

    @Override
    public String toString() {
        return "perimeter is " + getPerimeter() +
                ", area is " + getArea ();
    }
}
