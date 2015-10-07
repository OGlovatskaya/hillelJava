import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by user on 07.10.2015.
 */
public class Callers {
    public static void main(String [] args){
        ImprovedEncryption cryption = new ImprovedEncryption("Secret message", new char[3]);
        cryption.key[0] = 'f';
        cryption.key[1] = 'l';
        cryption.key[2] = 'h';


        String encryptedMessage = cryption.crypt("Secret message");
        String decryptedMessage = cryption.crypt(encryptedMessage);
        System.out.println(encryptedMessage);
        System.out.println(decryptedMessage);

    }
}
