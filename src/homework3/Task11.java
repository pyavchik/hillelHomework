package homework3; /**
 * Created by Dim on 20.02.2016.
 */
/*2. i18n используется для обозначения слова internationalization, где 18 означает количество букв
        между первой и последней в этом слове, такое можно встретить в среде разработчиков. Например, для
        слова localization используется сокращение l10n.
        Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму.
        Слова длиной меньше 4х оставить без изменений.

        Пример ввода:
        internationalization localization cat elephant monitor
        Результат:
        i18n l10n cat e6t m5r

PS: напишите функцию, которая сокращает слово, в основной функции используйте метод сплит,
который поместит слова в массив и для каждого из них вызовет вашу функцию*/
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
//be careful
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your words here: ");
        String word = scanner.nextLine();
        String[] wordsArray = word.split(" ");

        for (int i = 0; i < wordsArray.length; i++) {
            System.out.print(abbreviateWord(wordsArray[i]));
            if (i < (wordsArray.length - 1)) {
                System.out.print(" ");
            }
        }
    }

    private static String abbreviateWord(String word) {
        int wordLength = word.length();
        if (wordLength > 3) {
            word = word.substring(0, 1) + (wordLength - 2) + word.substring(wordLength - 1, wordLength);
        }
        return word;

    }
}
