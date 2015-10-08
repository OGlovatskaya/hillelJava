package HomeWorkOOP;

/**
 * Created by user on 06.10.2015.
 */
public class RectangleTask {

    double rectanglePerimeter;
    double rectangleArea;

    public RectangleTask(double rectanglePerimeter, double rectangleArea) {
        this.rectanglePerimeter = rectanglePerimeter;
        this.rectangleArea = rectangleArea;
    }

    public boolean hasSolution() {
        double halfPerimeter = rectanglePerimeter / (-2);
        double discriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);
        if (discriminant >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public Rectangle getRectangle() {
        double halfPerimeter = rectanglePerimeter / (-2);
        double discriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);
        double rectangleLength;
        double rectangleHeight;
        if (hasSolution()) {
            rectangleLength = ((halfPerimeter * (-1)) + Math.sqrt(discriminant)) / 2;
            rectangleHeight = ((halfPerimeter * (-1)) - Math.sqrt(discriminant)) / 2;
            Rectangle rectangle = new Rectangle(rectangleLength, rectangleHeight);
            return rectangle;
        } else return null;
    }
}




