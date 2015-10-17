package ShapesAndPaints;

/**
 * Created by user on 18.10.2015.
 */
public class Rectangle extends Shape {
    private double height;
    private double length;
    private Paint paint;

    public Rectangle (Paint paint,double height, double length){
        this.paint = paint;
        this.height = height;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + height);
    }

    @Override
    public double getArea() {
        return length * height;
    }

    public double paintConsumption(){
        return getArea() * paint.paintConsumption();
    }

    @Override
    public String toString() {
        return "Rectangle's height is " + height + ", length is " + length +
                "; " + super.toString() + "; rectangle's color is " +
                paint.getColor() + "; paint consumption is " + paintConsumption() + ".";
    }
}
