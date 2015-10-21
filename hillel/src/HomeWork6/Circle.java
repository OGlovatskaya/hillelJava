package HomeWork6;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by user on 13.10.2015.
 */
public class Circle extends Shape {
    private double radius;
    private Paint paint;

    public Circle (Paint paint, double radius){
        this.paint = paint;
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return new BigDecimal(perimeter).setScale(2, RoundingMode.UP).doubleValue();
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return new BigDecimal(area).setScale(2, RoundingMode.UP).doubleValue();
    }

    public double paintConsumption(){
        return getArea() * paint.paintConsumption();
    }

    @Override
    public String toString() {
        return "Circle's radius is " + radius +
                "; " + super.toString() + "; circle's color is " +
                paint.getColor() + "; paint consumption is " + paintConsumption() + ".";
    }

}