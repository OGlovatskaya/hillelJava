/**
 * Created by user on 04.10.2015.
 */
public class Encryption {
    public static void main(String[] args) {

        String message = "Secret message";
        char key = 'f';
        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + crypt(message, key));
        System.out.println("Decrypted message: " + decrypt(message, key));
    }

    public static String crypt(String message, char key) {
        char[] cryptedMessage = message.toCharArray();

        for (int i = 0; i < cryptedMessage.length; i++) {
            cryptedMessage[i] = ((char) (cryptedMessage[i] ^ key));
        }
        String cryptMessage = String.copyValueOf(cryptedMessage);
        return cryptMessage;
    }

    public static String decrypt(String message, char key) {
        char[] unCryptedtMassage = crypt(message, key).toCharArray();

        for (int i = 0; i < unCryptedtMassage.length; i++) {
            unCryptedtMassage[i] = ((char) (unCryptedtMassage[i] ^ key));
        }
        String unCryptMessage = String.copyValueOf(unCryptedtMassage);
        return unCryptMessage;
    }


}
