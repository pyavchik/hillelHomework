package homework2;

/**
 * Created by Dim on 17.02.2016.
 */
//3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
public class Task03 {
    public static void main(String[] args) {

        int num = 90;

        while (num >= 0){
            System.out.println(num);
            num-=5;
        }

    }
}
