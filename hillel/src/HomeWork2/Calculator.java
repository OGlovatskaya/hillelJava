package HomeWork2;

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
                break;
            case "fract":
                intPartNumber = (Math.floor(number));
                result = number - intPartNumber;
                break;
            case "-":
                System.out.println("Enter second number: ");
                double secondNumber = scanner.nextDouble();
                result = number - secondNumber;
                break;
            case "+":
                System.out.println("Enter second number: ");
                secondNumber = scanner.nextDouble();
                result = number + secondNumber;
                break;
            case "/":
                System.out.println("Enter second number: ");
                secondNumber = scanner.nextDouble();
                result = number / secondNumber;
                break;
            case "*":
                System.out.println("Enter second number: ");
                secondNumber = scanner.nextDouble();
                result = number * secondNumber;
                break;
        }

        if ((result - Math.floor(result)) > 0 && result >=1.7e-308 && result <=1.7e308){
            dataType = "(double)";
        }else if (result >= -128 && result <= 127){
            dataType = "(byte)";
        }else if(result >= -32768 && result <=32767){
            dataType = "(short)";
        }else if(result >= -2147483648 && result <=2147483647){
            dataType = "(int)";
        }else if(result >= -922372036854775808L && result <=922372036854775807L){
            dataType = "(long)";
        }

        System.out.println("Result: " + result + " " + dataType);

    }
}

