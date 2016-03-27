package homework1;

/**
 * Created by Dim on 13.02.2016.
 */

    // Find and display minimum number
    // Display all the minimums, if there is more than one
public class Minimum {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 3;
        int num3 = 3;

        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println("Minimum is num3: " + num3);
            } else {
                System.out.print("Minimum numbers are num2=" + num2);
                if (num2 == num3) System.out.print(", num3=" + num3);
                System.out.println();
            }
        } else {
            if (num1 > num3) {
                System.out.println("Minimum is num3: " + num3);
            } else {
                System.out.print("Minimum numbers are num1=" + num1);
                if (num1 == num2) System.out.print(", num2=" + num2);
                if (num1 == num3) System.out.print(", num3=" + num3);
                System.out.println();
            }
        }
    }
}
