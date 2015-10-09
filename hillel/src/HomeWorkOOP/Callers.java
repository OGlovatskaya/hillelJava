package HomeWorkOOP;

/**
 * Created by user on 10.10.2015.
 */
public class Callers {
    public static void main(String[] args) {
        cryption();
        rectangle();
    }

    private static void cryption() {
        ImprovedEncryption crypt = new ImprovedEncryption("Secret message", new char[3]);
        crypt.key[0] = 'f';
        crypt.key[1] = 'l';
        crypt.key[2] = 'h';

        String encryptedMessage = crypt.crypt("Secret message");
        String decryptedMessage = crypt.crypt(encryptedMessage);

        System.out.println("Original message: " + crypt.message);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }

    private static void rectangle() {
        RectangleTask rectangle = new RectangleTask(30, 50);
        System.out.println(rectangle.getRectangle());
    }

}
