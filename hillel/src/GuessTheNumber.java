import java.util.Scanner;

/**
 * Created by user on 04.10.2015.
 */
public class GuessTheNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = 25;
        int enteredNumber;
        int counter=0;


        do {
            System.out.println("Enter the number: ");
            enteredNumber = scanner.nextInt();
            if (enteredNumber < number){
                System.out.println("Guessed number is higher than the entered");
            }else if (enteredNumber > number) {
                System.out.println("Guessed number is lower than the entered");
            }
            counter++;
        }while (enteredNumber != number);
        System.out.println("You guessed the number " + number + " in " + counter + " tries");

    }
}
