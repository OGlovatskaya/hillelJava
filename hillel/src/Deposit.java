import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by user on 04.10.2015.
 */
public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Initial deposit amount: ");
        double deposit = scanner.nextDouble();

        System.out.println("Interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.println("Deposit duration: ");
        int depositDuration = scanner.nextInt();

        System.out.println("Desirable amount: ");
        double desirableAmount = scanner.nextDouble();

        int periodCounter;
        int periodCounter1 = 0;

        for (periodCounter = 0; periodCounter < depositDuration; periodCounter++){
            deposit += deposit * interestRate / 100 / 12;
        }

        double roundDepositAmount = new BigDecimal(deposit).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println("The amount of deposit in " + depositDuration + " months " + " will be " + roundDepositAmount);


        while (deposit < desirableAmount) {
            deposit += deposit * interestRate / 100 / 12;
            periodCounter1++;
        }

        double roundDepositAmount1 = new BigDecimal(deposit).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println("The deposit amount will exceed " + desirableAmount + " in " + periodCounter1 + " months");

    }
}
