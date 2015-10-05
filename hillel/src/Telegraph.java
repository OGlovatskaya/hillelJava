import java.util.Scanner;

/**
 * Created by user on 04.10.2015.
 */
public class Telegraph {
    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String message = scanner.nextLine();

        System.out.println("Enter the price for a word: ");
        double price = scanner.nextDouble();

        String[] splMessage = message.split(" ");
        int messageLength = splMessage.length;

        double priceForTheMessage = 0;

        for (int i = 0; i <= messageLength ; i++){
            priceForTheMessage = i * price;
        }
        System.out.println(priceForTheMessage);

    }
}
