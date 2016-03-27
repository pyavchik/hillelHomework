package homework3;

/**
 * Created by Dim on 20.02.2016.
 */
public class NumSysConverter {

    public static int[] denaryToBinary(int number) {
        int[] binaryNumber = new int[32];
        for (int i = 31; number > 0; i--) {
            binaryNumber[i] = number % 2;
            number /= 2;
        }
        return binaryNumber;
    }

    public static int binaryToDenary (int[] number) {
        int powerElement = number.length-1;
        int denaryNumber = 0;
        for (int i = 0; i < number.length ; i++) {
            denaryNumber += Math.pow(2, powerElement) * number[i];
            powerElement--;
        }
        return denaryNumber;
    }
}
