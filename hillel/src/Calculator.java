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

        double intPartNumber;
        double result = 0;

        String dataType = "(byte)";

        switch (operation) {
            case "trunk":
                result = Math.floor(number);
                System.out.println("Result: " + result);
                break;
            case "fract":
                intPartNumber = (Math.floor(number));
                result = number - intPartNumber;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Enter second number: ");
                break;
        }
        double secondNumber = scanner.nextDouble();

        if (result >= -128 && result <= 127){
            dataType = "(byte)";
        }else if(result >= -32768 && result <=32767){
            dataType = "(short)";
        }else if(result >= -2147483648 && result <=2147483647){
            dataType = "(int)";
        }else if(result >= -922372036854775808L && result <=922372036854775807L){
            dataType = "(long)";
        }else if (result >= 1.7e-308 && result <=1.7e308){
            dataType = "(double)";
        }

        switch (operation) {
            case "-":
                result = number - secondNumber;
                System.out.println("Result: " + result + " " + dataType);
                break;
            case "+":
                result = number + secondNumber;
                System.out.println("Result: " + result + " " + dataType);
                break;
            case "/":
                result = number / secondNumber;
                System.out.println("Result: " + result + " " + dataType);
                break;
            case "*":
                result = number * secondNumber;
                System.out.println("Result: " + result + " " + dataType);
                break;
        }


    }
}
