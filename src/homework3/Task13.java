package homework3; /**
 * Created by Dim on 20.02.2016.
 */
/*4. Создайте класс в котором будут 2 статических метода:
        - перевод числа из 2ой в 10ную систему счисления
        - перевод числа из 10ной в 2ную систему счисления
        В методе main другого класса дайте возможность пользователю выбрать, что он хочет делать из 2х вариантов и вызовите соответствующую функцию.

        Пример ввода:
        Choose the option:
        1 - Convert a number from binary to denary
        2 - Convert a number from denary to binary
        Enter: 2
        Number: 12
        Результат:
        1100*/

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        int inputConverterOption;

        System.out.println("Choose the option:");
        System.out.println("1 - Convert a number from binary to denary");
        System.out.println("2 - Convert a number from denary to binary");
        System.out.print("Enter: ");

        Scanner scanner = new Scanner(System.in);
        inputConverterOption = scanner.nextInt();

        switch (inputConverterOption) {
            case 1: {
                System.out.print("Input binary number (e.g. 101010111): ");
                int[] number = Utils.getBinaryNumberFromConsole();
                System.out.print("Your number in Denary system: ");
                System.out.println(NumSysConverter.binaryToDenary(number));
                break;
            }
            case 2: {
                System.out.print("Number: ");
                Scanner scanNumber = new Scanner(System.in);
                int number = scanNumber.nextInt();
                System.out.print("Your number in Binary system: ");
                Utils.printBinaryArray(NumSysConverter.denaryToBinary(number));
                break;
            }
            default: {
                System.out.println("Unknown option");
                break;
            }
        }

    }
}
