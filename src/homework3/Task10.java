package homework3;

/**
 * Created by Dim on 20.02.2016.
 */

/*1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:
@ заменяется на [ at ]. заменяется на [ dot ]

Пример ввода:
        person@gmail.com
Результат:
        person[ at ]gmail[ dot ].com*/
public class Task10 {
    public static void main(String[] args) {
        String email = "dmitrygovoroff@gmail.com";
        System.out.println(ReplaceAtAndDotInEmailAddress(email));
    }

    private static String ReplaceAtAndDotInEmailAddress (String emailAddress){
        emailAddress = emailAddress.replace("@", "[at]");
        emailAddress = emailAddress.replace(".", "[dot]");
        return emailAddress;
    }
}
