package HomeWork6;

import HomeWork6.Paint;
import HomeWork6.Shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by user on 18.10.2015.
 */
public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private Paint paint;

    public Triangle (Paint paint,double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.paint = paint;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        double area = Math.sqrt((halfPerimeter*(halfPerimeter - sideA)*(halfPerimeter - sideB)*(halfPerimeter - sideC)));
        return new BigDecimal(area).setScale(2, RoundingMode.UP).doubleValue();
    }

    public double paintConsumption(){
        return getArea() * paint.paintConsumption();
    }

    @Override
    public String toString() {
        return "Triangle's side a is " + sideA + ", side b is " + sideB + ", side c is " + sideC +
                "; " + super.toString() + "; triangle's color is " +
                paint.getColor() + "; paint consumption is " + paintConsumption() + ".";
    }
}
