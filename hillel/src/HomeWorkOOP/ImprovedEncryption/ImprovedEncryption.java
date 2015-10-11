package HomeWorkOOP.ImprovedEncryption;

/**
 * Created by user on 09.10.2015.
 */
public class ImprovedEncryption {
    public String message;
    public char[] key;

    public ImprovedEncryption (String message, char[] key){
        this.message = message;
        this.key = key;
    }

    public String crypt(String message){
        char[] cryptedMessage = message.toCharArray();
        for (int i=0; i < cryptedMessage.length; i++ ){
            cryptedMessage[i] = (char) (cryptedMessage[i] ^ key[i%key.length]);
        }
        String cryptMessage = String.copyValueOf(cryptedMessage);
        return cryptMessage;
    }
}
