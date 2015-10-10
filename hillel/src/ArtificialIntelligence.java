import java.util.Random;
import java.util.Scanner;

/**
 * Created by user on 11.10.2015.
 */
public class ArtificialIntelligence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxNumber = 10;
        int minNumber = 0;
        int number = random.nextInt(maxNumber - minNumber) + minNumber;

        System.out.println("Guess some number and remember it");
        System.out.println("Did you guess " + number + "?");

        while (scanner.hasNext()) {
            String answer = scanner.nextLine();
            if (answer.equals("down")) {
                maxNumber = number;
                number = random.nextInt(maxNumber - minNumber) + minNumber;
                System.out.println("Did you guess " + number + "?");
            } else if (answer.equals("up")) {
                minNumber = number + 1;
                number = random.nextInt(maxNumber - minNumber) + minNumber;
                System.out.println("Did you guess " + number + "?");
            } else if (answer.equals("yes")) {
                System.out.println("I guessed it!");
                break;
            }
        }

    }
}
