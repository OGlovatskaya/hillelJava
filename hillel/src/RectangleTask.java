/**
 * Created by user on 06.10.2015.
 */
public class RectangleTask {

    double rectanglePerimeter;
    double rectangleArea;


    private double halfPerimeter = rectanglePerimeter / (-2);
    private double discriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);


    public RectangleTask(double rectanglePerimeter, double rectangleArea) {
        this.rectanglePerimeter = rectanglePerimeter;
        this.rectangleArea = rectangleArea;
        //getRectangle();
    }

    public boolean hasSolution() {
        if (discriminant >= 0) {
            return true;
        } else {
            return false;
        }
    }

/*    double rectangleLength() {
        rectangleLength = ((halfPerimeter * (-1)) + Math.sqrt(discriminant)) / 2;
        return rectangleLength;
    }

    double rectangleHeight() {
        rectangleHeight = (((halfPerimeter * (-1)) - Math.sqrt(discriminant)) / 2);
        return rectangleHeight;
    }
*/
/*    //public double[] getRectangle() {
        public Rectangle getRectangle(){
        boolean solution = hasSolution();
        if (solution == false) {
            return null;
        }
        else if (solution == true) {
             double rectangleLength = ((halfPerimeter * (-1)) + Math.sqrt(discriminant)) / 2;
             double rectangleHeight = ((halfPerimeter * (-1)) - Math.sqrt(discriminant)) / 2;
        }
        //double[] result = {rectangleLength, rectangleHeight};

    }
*/

}
    // метод для решения уравнения
    // договоримся, что если уравнение имеет корни, метод вернет true,
    // иначе - false
/*    public boolean solve()
    {
        switch(getRootQuantity())
        {
            case 0:
                return false;
            case 1:
                x1 = x2 = -(b/(2*a)); // корни равны
                return true;
            case 2:
                x1 = (-b + Math.sqrt(disc))/(2*a);
                x2 = (-b - Math.sqrt(disc))/(2*a);
                return true;
        }
        return false;
    }

    // получить значения
    public double getX1() { return this.x1; }
    public double getX2() { return this.x1; }
}
*/

