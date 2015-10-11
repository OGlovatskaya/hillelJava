import java.util.Scanner;

/**
 * Created by user on 11.10.2015.
 */
public class ArtificialIntelligence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        int maxNumber = 100;
        int minNumber = 0;
        int number = (int) (minNumber + (Math.random() * (maxNumber - minNumber)));

        System.out.println("Guess some number and remember it");

        do {
            System.out.println("Did you guess " + number + "?");
            answer = scanner.nextLine();
            if (answer.equals("down")) {
                maxNumber = number;
                number = (int) (minNumber + (Math.random() * (maxNumber - minNumber)));
            } else if (answer.equals("up")) {
                minNumber = number + 1;
                number = (int) (minNumber + (Math.random() * (maxNumber - minNumber)));
            }
        } while (!answer.equals("yes"));
        System.out.println("I guessed it! Your number is " + number + "!");
    }
}
