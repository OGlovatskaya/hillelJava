package HomeWork2;

import java.util.Scanner;

/**
 * Created by user on 15.11.2015.
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner rectangle = new Scanner(System.in);

        System.out.println("Please enter rectangle perimeter: ");
        double rectanglePerimeter = rectangle.nextDouble();


        System.out.println("Please enter rectangle area: ");
        double rectangleArea = rectangle.nextDouble();

        double halfPerimeter = rectanglePerimeter / (-2);
        double discriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);

        double rectangleLength;
        double rectangleHeight;

        if (discriminant < 0) {
            System.out.println("Rectangle with such parameters does not exist");

        } else {
            rectangleLength = ((halfPerimeter * (-1)) + Math.sqrt(discriminant)) / 2;
            rectangleHeight = ((halfPerimeter * (-1)) - Math.sqrt(discriminant)) / 2;
            System.out.println("Rectangle length is " + rectangleLength);
            System.out.println("Rectangle height is " + rectangleHeight);
        }

    }
}

