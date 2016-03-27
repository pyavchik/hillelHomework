package homework5;

/**
 * Created by Dim on 28.02.2016.
 */
public class Encode {
    public static void main(String[] args) {
        String initialMessage = "Now you see me";
        char key = 'A';
        String encryptedMessage = crypt(initialMessage, key);
        String decryptedMessage = crypt(encryptedMessage, key);

        System.out.println("Initial message: " + initialMessage);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }

    public static String crypt(String message, char key) {
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key;
        }
        return String.copyValueOf(chars);
    }

}
