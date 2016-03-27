package homework3;

/**
 * Created by Dim on 20.02.2016.
 */

/*3. Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
        Определить количество таких слов в тексте, в котором все слова введены через запятую.

        Пример ввода:
        deleveled, evitative, cat, dog, deified
        Результат:
        There are 3 palindromes in the text

        PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа*/
public class Task12 {
    public static void main(String[] args) {
        String palindromeString = "deleveled, cat, dog, evitative, deified";
        String[] stringArray = palindromeString.split(",");

        int palindromeCounter = 0;
        for (String element : stringArray){
            element = element.trim();
            if (palindromeCheck(element)){
                palindromeCounter++;
            }
        }
        System.out.println("There are " + palindromeCounter + " palindromes in the text");
    }

    private static boolean palindromeCheck(String word){
        boolean palindrome = false;
        int firstLetterIndex = 0;
        int lastLetterIndex = word.length()-1;
        int halfLength = word.length()/2;
        while (word.charAt(firstLetterIndex) == word.charAt(lastLetterIndex)){
            firstLetterIndex++;
            lastLetterIndex--;
            if (lastLetterIndex < halfLength){
                palindrome = true;
                break;
            }
        }
        return palindrome;
    }

}
