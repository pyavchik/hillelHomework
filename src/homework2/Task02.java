package homework2;

/**
 * Created by Dim on 17.02.2016.
 */
//2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Task02 {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 0; i < 55; i++) {
            System.out.println(num);
            num+=2;
        }
    }
}
