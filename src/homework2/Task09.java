package homework2;

/**
 * Created by Dim on 17.02.2016.
 */
//9. Перевести число в двоичную систему счисления
public class Task09 {
    public static void main(String[] args) {

        int number = 20415;
        int[] binaryNumber = fillingArrayInReverseOrderWithBinaryNumbers(number);

        for (int element : binaryNumber) {
            System.out.print(element);
        }
    }

    private static int[] fillingArrayInReverseOrderWithBinaryNumbers(int number) {
        int[] binaryNumber = new int[32];

        for (int i = 31; number > 0; i--) {
            binaryNumber[i] = number % 2;
            number /= 2;
        }
        return binaryNumber;
    }
}
