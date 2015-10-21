package HomeWork4;

/**
 * Created by user on 09.10.2015.
 */
public class Rectangle {
    public double rectangleLength;
    public double rectangleHeight;

    public Rectangle(double rectangleLength, double rectangleHeight) {
        this.rectangleLength = rectangleLength;
        this.rectangleHeight = rectangleHeight;
    }

    public String toString() {
        String result = "Rectangle length" + " " + rectangleLength + "; " + "Rectangle height" + " " + rectangleHeight;
        return result;
    }

}
