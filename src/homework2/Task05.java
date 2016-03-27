package homework2;

/**
 * Created by Dim on 17.02.2016.
 */
//5. Найти сумму первых n элементов массива
public class Task05 {
    public static void main(String[] args) {

        int[] array = {4, 5, 3, 2, 6, 7, 8};
        int n = 5;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum);
    }
}
