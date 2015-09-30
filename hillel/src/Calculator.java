import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by user on 29.09.2015.
 */
public class Calculator {
    public static void main(String[] args) {

        calculator();

    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double number = scanner.nextDouble();

        System.out.println("Enter the operation: ");
        String operation = scanner.next();

        switch (operation) {
            case "trunk":
                System.out.println("Result: " + Math.floor(number));
                break;
            case "fract":
                double intPartNumber = (Math.floor(number));
                double newNumber = number - intPartNumber;
                System.out.println("Result: " + newNumber);
                break;
            default:
                System.out.println("Enter second number: ");
                break;
        }
        double secondNumber = scanner.nextDouble();

        double result;

        switch (operation) {
            case "-":
                result = number - secondNumber;
                System.out.println("Result: " + result);
                break;
            case "+":
                result = number + secondNumber;
                System.out.println("Result: " + result);
                break;
            case "/":
                result = number / secondNumber;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = number * secondNumber;
                System.out.println("Result: " + result);
                break;
        }
    }
}
