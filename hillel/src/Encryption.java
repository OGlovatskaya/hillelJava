/**
 * Created by user on 04.10.2015.
 */
public class Encryption {
    public static void main(String[] args) {

        String message = "Secret message";
        char key = 'f';
        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + (message = crypt(message, key)));
        System.out.println("Decrypted message: " + crypt(message, key));
    }

    public static String crypt(String message, char key) {

        char[] cryptedMessage = message.toCharArray();
        for (int i = 0; i < cryptedMessage.length; i++) {
            cryptedMessage[i] = ((char) (cryptedMessage[i] ^ key));
        }
        String cryptMessage = String.copyValueOf(cryptedMessage);
        return cryptMessage;
    }

}
