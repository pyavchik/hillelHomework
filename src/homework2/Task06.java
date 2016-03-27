package homework2;

/**
 * Created by Dim on 17.02.2016.
 */
//6. Найти минимальный и максимальный элемент массива
public class Task06 {
    public static void main(String[] args) {

        int[] array = {5, 345, 1, 2, 15, 0, 7};
        int min = array[0];
        int max = array[0];

        for (int element : array){
            if (element < min){
                min = element;
            }
            if (element > max){
                max = element;
            }
        }

        System.out.println(min);
        System.out.println(max);


    }
}
