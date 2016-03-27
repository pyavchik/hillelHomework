package homework1;

/**
 * Created by Dim on 14.02.2016.
 */

    //Check is number odd or even.
public class OddOrEven {
    public static void main(String[] args) {
        double number = 17;
        double remainder = number % 2;

        if (remainder == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
