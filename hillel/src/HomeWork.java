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


        System.out.println("Please enter rectangle area: ");
        double rectangleArea = rectangle.nextDouble();

        double halfPerimeter = rectanglePerimeter / (-2);
        double discriminant = (Math.pow(halfPerimeter, 2) - 4 * rectangleArea);

        double rectangleLength;
        double rectangleHeight;

        if (discriminant < 0) {
            System.out.println("HomeWorkOOP.Rectangle with such parameters does not exist");

        } else {
            rectangleLength = ((halfPerimeter * (-1)) + Math.sqrt(discriminant)) / 2;
            rectangleHeight = ((halfPerimeter * (-1)) - Math.sqrt(discriminant)) / 2;
            System.out.println("HomeWorkOOP.Rectangle length is " + rectangleLength);
            System.out.println("HomeWorkOOP.Rectangle height is " + rectangleHeight);
        }

    }

}

