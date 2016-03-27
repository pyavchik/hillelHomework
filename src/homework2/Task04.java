package homework2;

/**
 * Created by Dim on 17.02.2016.
 */
//4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
public class Task04 {
    public static void main(String[] args) {

        int num = 2;

        for (int i = 0; i < 20 ; i++) {
            System.out.println(num);
            num*=2;
        }
    }
}
