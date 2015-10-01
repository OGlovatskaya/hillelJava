import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.Scanner;

/**
 * Created by OGlovatskaya on 24.09.2015.
 */
public class WorkFlowControl {
    public static void main(String[] args) {

        double d = 2.0;
        isEven((int) d);
        isEven((int) d, true);
        //notOperatorExample();
        //caseWithStringsExample();
        //switchCaseExample();
        //ifExample();
    }

    private static void notOperatorExample() {
        boolean todayIsThursday= true;
        boolean iShouldStudyJava = true;
        todayIsThursday = !(todayIsThursday && iShouldStudyJava);

        boolean isEven = !isOdd(10);
    }

    private static void ternaryExample() {
        int number = 5;
        String isEven = isEven(number);
        isEven = (number % 2 ==0) ? "yes" : "no";  //тернарный оператор
    }

    private static boolean isOdd (int someNumber) {
        System.out.println("int");
        if(someNumber % 2 !=0){
            return true;
        }else {
            return false;
        }
    }

    public static String isEven(int someNumber, boolean someAnotherParam){
        System.out.println("int with double");
        if(someNumber % 2 ==0){
            return "yes";
        }else {
            return "no";
        }
    }

    public static String isEven(int someNumber){
        if(someNumber % 2 ==0){
            return "yes";
        }else {
            return "no";
        }
    }

    public static boolean isEven(double someNumber){
        System.out.println("double");
        if(someNumber % 2 ==0){
            return true;
        }else {
            return false;
        }
    }
    private static void caseWithStringsExample() {
        String month = "mar";
        switch (month) {
            case "jan":
            case "feb":
            case "dec":
                System.out.println("winter");
                break;
            case "mar":
            case "apr":
            case "may":
                System.out.println("spring");
                break;
            default:
                System.out.println("wrong month name: " + month);
                break;
        }
    }

    private static void switchCaseExample() {
        int month = 2;
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 5:
                System.out.println("may");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("wrong month number");
                break;
            case 2:
                System.out.println("feb");
                break;
        }
    }

    private static void ifExample() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your age: ");
        int age = scanner.nextInt();

        if (age < 20) {
            System.out.println("you are young");

        } else {
            System.out.println("you aren't so young");
        }

        if (age < 10) {
            System.out.println("kid");
        } else if (age < 20) {
            System.out.println("teen");
        } else if (age < 50) {
            System.out.println("adult");
        } else {
            System.out.println("old");
        }

        if (age >= 0 && age < 10) {
            System.out.println("kid");
        }

        if (age >= 10 && age < 20) {
            System.out.println("teen");
        }

        if (age >= 20 && age < 50) {
            System.out.println("adult");
        }

        if (age >= 50) {
            System.out.println("old");
        }





/*        boolean condition = false;

        if (condition) System.out.println("in IF");
        System.out.println("out of IF block");

        if (condition) {
            System.out.println("in IF");
        }

        if (condition) {
            System.out.println("in IF");
            System.out.println("still in IF block");
        }

        System.out.println("out of IF block");
*/

    }

}
