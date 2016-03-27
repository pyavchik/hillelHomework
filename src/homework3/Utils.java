package homework3;

import java.util.Scanner;

public class Utils {

    public static int[] getArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = scanner.nextInt();

        System.out.println("Fill up the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] getBinaryNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] binaryArray = new int[32];
        int index = 31;

        while (number > 0) {
            binaryArray[index] = number % 10;
            number /= 10;
            index--;
        }
        return binaryArray;
    }

    public static void printArray(int[] array) {
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.println(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
    }

    public static void printBinaryArray(int[] array) {
        boolean zeroAtLeftSide = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                zeroAtLeftSide = false;
            }
            if (!zeroAtLeftSide) {
                System.out.print(array[i]);
            }
        }
    }


}