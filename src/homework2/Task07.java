package homework2;

/**
 * Created by Dim on 17.02.2016.
 */
//7. Найти сумму всех четных и сумму всех нечетных элементов массива
public class Task07 {
    public static void main(String[] args) {

        int[] array = {2, 13, 2, 5, 8, 1};
        int sumOdds = 0;
        int sumEvens = 0;

        for (int element : array) {
            if ((element % 2) == 0){
                sumEvens += element;
            }else{
                sumOdds += element;
            }
        }

        System.out.println(sumEvens);
        System.out.println(sumOdds);
    }
}
