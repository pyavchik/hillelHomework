package homework6;

/**
 * Created by Dim on 02.03.2016.
 */
public class Encryptor {
    private char[] key;

    public Encryptor(char[] key) {
        this.key = key;
    }

    public String crypt(String message) {
        char[] chars = message.toCharArray();
        int keyIndex;

        for (int i = 0; i < chars.length; i++) {
            keyIndex = i % key.length;
            chars[i] ^= key[keyIndex];
        }
        return String.copyValueOf(chars);
    }
}