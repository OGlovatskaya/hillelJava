package HomeWorkOOP;

/**
 * Created by user on 09.10.2015.
 */
public class RectangleTask {
    public double rectanglePerimeter;
    public double rectangleArea;


    public RectangleTask (double rectanglePerimeter, double rectangleArea){
        this.rectanglePerimeter = rectanglePerimeter;
        this.rectangleArea = rectangleArea;
    }

    public boolean hasSolution(){
        double halfPerimeter = rectanglePerimeter / (-2);
        double diskriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);
        if (diskriminant >= 0){
            return true;
        } else return false;
    }

    public Rectangle getRectangle(){
        double halfPerimeter = rectanglePerimeter / (-2);
        double diskriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);
        if (hasSolution()){
            double rectangleLength = ((halfPerimeter*(-1) - Math.sqrt(diskriminant))/ 2);
            double rectangleHeight = ((halfPerimeter*(-1) - Math.sqrt(diskriminant))/2);
            Rectangle rectangle = new Rectangle(rectangleLength, rectangleHeight);
            return rectangle;
        }else return null;
    }

}
