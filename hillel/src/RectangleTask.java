/**
 * Created by user on 06.10.2015.
 */
public class RectangleTask {

    double rectanglePerimeter;
    double rectangleArea;

    double rectangleLength;
    double rectangleHeight;


    public RectangleTask() {
    }

    public RectangleTask(double rectanglePerimeter, double rectangleArea) {
        this.rectanglePerimeter = rectanglePerimeter;
        this.rectangleArea = rectangleArea;
    }

    double rectangleLength(double rectanglePerimeter, double rectangleArea) {
        double halfPerimeter = rectanglePerimeter / (-2);
        double discriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);
        rectangleLength = ((halfPerimeter * (-1)) + Math.sqrt(discriminant)) / 2;
        return rectangleLength;
    }

    double rectangleHeight(double rectanglePerimeter, double rectangleArea) {
        double halfPerimeter = rectanglePerimeter / (-2);
        double discriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);
        rectangleHeight = (((halfPerimeter * (-1)) - Math.sqrt(discriminant)) / 2);
        return rectangleHeight;
    }

/*    public RectangleTask getRectangle(double rectangleLength, double rectangleHeight){

        double halfPerimeter = rectanglePerimeter / (-2);
        double discriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);
        if (discriminant >= 0) {
            rectangleLength = (int)((halfPerimeter * (-1)) + Math.sqrt(discriminant)) / 2;
            rectangleHeight = (int)(((halfPerimeter * (-1)) - Math.sqrt(discriminant)) / 2);
        }
        return rectangleLength;


    }
*/

}



