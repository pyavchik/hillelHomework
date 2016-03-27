package homework6;

/**
 * Created by Dim on 02.03.2016.
 */
public class MainHW6 {
    public static void main(String[] args) {
        improvedArrayExample();

        encryptorExample();

    }

    private static void improvedArrayExample() {
        System.out.println("===FirstImprovedArray Example===");
        FirstImprovedArray firstArray = new FirstImprovedArray();
        firstArray.add("One");
        firstArray.add("Two");
        firstArray.add("Three");
        firstArray.add("Four");
        firstArray.add("Five");
        System.out.println("firstArray: " + firstArray);
        System.out.println("firstArray element with Index=2 : " + firstArray.get(2));
        System.out.println("firstArray size: " + firstArray.size());

        FirstImprovedArray secondArray = new FirstImprovedArray();
        secondArray.add("One");
        secondArray.add("Two");
        secondArray.add("Three");
        secondArray.add("Four");
        secondArray.add("Five");
        System.out.println("firstArray equals secondArray: " + firstArray.equals(secondArray));

        FirstImprovedArray thirdArray = new FirstImprovedArray();
        thirdArray.add("1");
        thirdArray.add("2");
        thirdArray.add("3");
        thirdArray.add("4");
        thirdArray.add("5");
        thirdArray.add("6");
        thirdArray.add("7");
        thirdArray.add("8");
        thirdArray.add("9");
        thirdArray.add("10");
        thirdArray.add("11");
        thirdArray.add("12");
        System.out.println("thirdArray size: " + thirdArray.size());
    }

    private static void encryptorExample() {
        System.out.println("===Encryptor Example===");

        char[] key = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
        Encryptor firstEncryptor = new Encryptor(key);
        String initialMessage = "Now you see me";

        String encryptedMessage = firstEncryptor.crypt(initialMessage);
        String decryptedMessage = firstEncryptor.crypt(encryptedMessage);

        System.out.println("Initial message: " + initialMessage);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}
