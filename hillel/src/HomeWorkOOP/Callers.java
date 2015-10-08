package HomeWorkOOP;

import HomeWorkOOP.ImprovedEncryption;
import HomeWorkOOP.Rectangle;
import HomeWorkOOP.RectangleTask;

/**
 * Created by user on 07.10.2015.
 */
public class Callers {
    public static void main(String[] args) {
        cryption();

        Rectangle rectangle = new RectangleTask(30, 50).getRectangle();
        System.out.println(rectangle);
    }

    private static void cryption() {
        ImprovedEncryption cryption = new ImprovedEncryption("Secret message", new char[3]);
        cryption.key[0] = 'f';
        cryption.key[1] = 'l';
        cryption.key[2] = 'h';

        String encryptedMessage = cryption.crypt("Secret message");
        String decryptedMessage = cryption.crypt(encryptedMessage);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);

    }


}
