import java.util.Scanner;

/**
 * Created by user on 26.09.2015.
 */
public class HomeWork {
    public static void main(String[] args) {
        evenOddNumbers();
        theNearestNumber();
        rectangle();


    }

    public static void evenOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }


    }

    public static void theNearestNumber() {
        Scanner numbers = new Scanner(System.in);
        final int constantNumber = 10;

        System.out.println("Please enter first number: ");
        int firstNumber = numbers.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = numbers.nextInt();

        if ((Math.abs(constantNumber - firstNumber)) < Math.abs(constantNumber - secondNumber)) {
            System.out.println(firstNumber + " is the nearest number to 10");
        } else {
            System.out.println(secondNumber + " is the nearest number to 10");
        }

    }

    public static void rectangle() {
        Scanner rectangle = new Scanner(System.in);

        System.out.println("Please enter rectangle perimeter: ");
        double rectanglePerimeter = rectangle.nextDouble();
        rectanglePerimeter = rectanglePerimeter / (-2);

        System.out.println("Please enter rectangle area: ");
        double rectangleArea = rectangle.nextDouble();

        double discriminant = (Math.pow(rectanglePerimeter, 2) - 4 * rectangleArea);

        double rectangleLength;
        double rectangleHeight;

        if (discriminant < 0) {
            System.out.println("Rectangle with such parameters does not exist");

        } else {
            rectangleLength = ((rectanglePerimeter * (-1)) + Math.sqrt(discriminant)) / 2;
            rectangleHeight = ((rectanglePerimeter * (-1)) - Math.sqrt(discriminant)) / 2;
            System.out.println("Rectangle length is " + rectangleLength);
            System.out.println("Rectangle height is " + rectangleHeight);
        }

    }

}

