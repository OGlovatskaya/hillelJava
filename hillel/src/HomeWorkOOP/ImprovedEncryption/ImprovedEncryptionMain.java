package HomeWorkOOP.ImprovedEncryption;

/**
 * Created by user on 11.10.2015.
 */
public class ImprovedEncryptionMain {
    public static void main(String[] args){
        ImprovedEncryption crypt = new ImprovedEncryption();

        String message = "Secret message";
        crypt.message = message;
        crypt.key = new char[4];
        crypt.key[0] = 'l';
        crypt.key[1] = 'l';
        crypt.key[2] = 'h';
        crypt.key[3] = 'n';
        //crypt.key[4] = 'm';
        //crypt.key[5] = 'h';
        //crypt.key[6] = 'u';
        //crypt.key[7] = 'u';

        String encryptedMessage = crypt.crypt(message);
        String decryptedMessage = crypt.crypt(encryptedMessage);

        System.out.println("Original message: " + crypt.message);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}
