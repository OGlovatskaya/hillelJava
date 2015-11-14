package HomeWork2;

import java.util.Scanner;

/**
 * Created by user on 15.11.2015.
 */
public class TheNearestNumber {
    public static void main(String[] args) {
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
}
