package HomeWork4;

/**
 * Created by user on 09.10.2015.
 */
public class ImprovedEncryption {
    public String message;
    public char[] key;

    public String crypt(String message){
        char[] cryptedMessage = message.toCharArray();
        for (int i=0; i < cryptedMessage.length; i++ ){
            cryptedMessage[i] = (char) (cryptedMessage[i] ^ key[i%key.length]);
        }
        String cryptMessage = String.copyValueOf(cryptedMessage);
        return cryptMessage;
    }
}
