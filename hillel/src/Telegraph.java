/**
 * Created by user on 04.10.2015.
 */
public class Telegraph {
    public static void main(String[] args ){

        String message = "Hello world";
        int price = 14;

        String[] splittedMessage = message.split(" ");
        int messageLength = splittedMessage.length;

        double priceForTheMessage = price * messageLength;
        System.out.println(priceForTheMessage);

    }
}
