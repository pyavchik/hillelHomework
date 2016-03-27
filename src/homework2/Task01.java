package homework2;

/**
 * Created by Dim on 17.02.2016.
 */
//1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
public class Task01 {
    public static void main(String[] args) {

        int num = 1000;

        while (num < 10_000){
            System.out.println(num);
            num+=3;
        }
    }
}
